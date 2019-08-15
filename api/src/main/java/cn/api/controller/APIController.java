package cn.api.controller;

import cn.api.util.ErrorCode;
import cn.common.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/api")
public class APIController {


    public Response<Boolean> get() {

        return Response.Success();
    }

}