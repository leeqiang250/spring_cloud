package cn.manager.controller;

import cn.common.util.Controller;
import cn.common.util.Response;
import cn.common.util.Service;
import cn.manager.dto.TestDto;
import cn.manager.entity.Test;
import cn.manager.feign.TestFeignService;
import cn.manager.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/test")
@Api("testTestController")
public class TestController extends Controller<Test, TestDto> {

    //@Value("${name0.name00.name000}")
    private String name;

    @Autowired
    private TestService testService;

    @Autowired
    private TestFeignService testFeignService;

    @Override
    public Service<Test, TestDto> getService() {
        return testService;
    }

    @Override
    public Response<List<TestDto>> getAll(String token) {
        Response<List<TestDto>> response = super.getAll(token);
        List<TestDto> dtos = response.getData();
        if (dtos != null && dtos.size() != 0) {
            dtos.forEach(dto -> {
                dto.setId(null);
            });
        }
        return response;
    }

    @GetMapping("/test1")
    @ApiOperation("test1")
    public Response<List<TestDto>> test1() {
        TestDto dto = new TestDto();
        dto.setTest(UUID.randomUUID().toString());
        testService.addOrUpdate(dto);
        return Response.Success(testService.getAll());
    }

    @GetMapping("/test2")
    @ApiOperation("test2")
    public Response<String> test2() {
        Response<String> response = testFeignService.test2();
        response.setData(response.getData() + name);
        return response;
    }

    @GetMapping("/test3")
    @ApiOperation("test3")
    public Response<String> test3(HttpServletRequest request) {
        Response<String> response = testFeignService.test3();
        response.setData(request.getServerPort() + response.getData());
        return response;
    }
}