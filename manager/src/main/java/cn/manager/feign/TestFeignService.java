package cn.manager.feign;

import cn.common.util.Response;
import cn.manager.dto.TestDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "service-user",path = "/test")
public interface TestFeignService {

    @GetMapping("/test2")
    @ApiOperation("test2")
    Response<String> test2();

}