package cn.user.controller;


import cn.common.util.*;
import cn.user.dto.TestDto;
import cn.user.entity.Test;
import cn.user.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/test")
@Api("test")
public class TestController extends Controller<Test, TestDto> {

    @Autowired
    private TestService testService;

    @Override
    public Service<Test, TestDto> getService() {
        return testService;
    }

    @Override
    @PostMapping({"/deleteAll"})
    @ApiOperation("deleteAll")
    public Response<Boolean> deleteAll(@ApiParam(required = true,value = "token") @RequestHeader("token") String token) {
        throw new BusinessException(ErrorCode.ParamError);
    }

    @GetMapping("/test")
    @ApiOperation("test")
    public Response<List<TestDto>> test() {
        TestDto dto = new TestDto();
        dto.setTest(UUID.randomUUID().toString());
        testService.addOrUpdate(dto);
        return Response.Success(testService.getAll());
    }
}