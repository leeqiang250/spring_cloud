package cn.manager.controller;

import cn.common.util.Response;
import cn.manager.dto.UserDto;
import cn.manager.feign.UserService;
import cn.manager.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;

    @Autowired
    private UserService userService;

    @GetMapping("/test/{test}")
    public Response<Boolean> test(@PathVariable String test) {
        String dd = userService.test();
        Response<UserDto> response = userService.getByToken(test);
        return Response.Success(response.isSuccess());
    }

}