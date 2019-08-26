package cn.manager.feign;

import cn.common.util.Response;
import cn.manager.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-user",path = "/user")
public interface UserService {

    @GetMapping("/getByToken")
    Response<UserDto> getByToken(@RequestHeader("token") String token);

    @GetMapping("/test")
    String test();

}