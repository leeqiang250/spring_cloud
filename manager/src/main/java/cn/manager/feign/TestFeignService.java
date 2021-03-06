package cn.manager.feign;

import cn.common.util.Response;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-user", path = "/test", fallback = TestFeignServiceHystric.class)
public interface TestFeignService {

    @GetMapping("/test2")
    @ApiOperation("test2")
    Response<String> test2();

    @GetMapping("/test3")
    @ApiOperation("test3")
    Response<String> test3();

}