package cn.api.Controller;

import cn.DTO;
import cn.Model;
import cn.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/api")
public class APIController {

    public Response<Boolean> get() {
        return Response.Success();
    }

}