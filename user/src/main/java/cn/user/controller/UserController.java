package cn.user.controller;

import cn.common.util.Response;
import cn.user.dto.UserDto;
import cn.user.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/getByToken")
    public Response<UserDto> getByToken(@ApiParam(required = true, value = "用户Token") @RequestHeader(value = "token") String token) {
        return Response.Success(userService.getByToken(token));
    }

}