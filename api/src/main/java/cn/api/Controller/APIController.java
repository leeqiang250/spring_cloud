package cn.api.Controller;

import cn.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/api")
public class APIController {


    private static ResponseCode fd = new ResponseCode();

    public Response<Boolean> get() {
        return Response.Success();
    }

}