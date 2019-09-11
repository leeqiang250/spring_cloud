package cn.manager.feign;

import cn.common.util.Response;
import org.springframework.stereotype.Component;

@Component
public class TestFeignServiceHystric implements TestFeignService {

    @Override
    public Response<String> test2() {
        return Response.Fail(null);
    }

    @Override
    public Response<String> test3() {
        return Response.Fail(null);
    }
}