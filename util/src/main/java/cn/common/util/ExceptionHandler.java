package cn.common.util;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @ApiOperation("全局异常处理")
    @org.springframework.web.bind.annotation.ExceptionHandler
    public Response<Boolean> handlerException(Throwable e) {
        //写日志
        if (e instanceof BusinessException) {
            BusinessException exception = (BusinessException) e;
            if (exception.getErrorCodeDTO() == null) {
                return Response.Fail();
            } else {
                return new Response<Boolean>(exception.getErrorCodeDTO());
            }
        } else {
            e.printStackTrace();
            return Response.Fail();
        }
    }
}