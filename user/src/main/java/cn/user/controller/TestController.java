package cn.user.controller;

import cn.common.util.*;
import cn.user.config.ParamConfig;
import cn.user.dto.TestDto;
import cn.user.entity.Test;
import cn.user.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RefreshScope
@RestController
@RequestMapping("/test")
@Api("testTestController")
public class TestController extends Controller<Test, TestDto> {

    @Value("${name0.name00.name000}")
    private String name;

    @Autowired
    private TestService testService;

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
        return Response.Success(name + ParamConfig.name0_name00_name000);
    }

    @GetMapping("/test3")
    @ApiOperation("test3")
    public code0 test3() {
        return null;
    }
}