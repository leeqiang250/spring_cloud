package cn.common.util;

import io.swagger.annotations.Api;

@Api(description = "错误代码列表", tags = "错误代码列表")
public class ErrorCode {

    public final static ErrorCodeDTO Success = new ErrorCodeDTO("200", "success");
    public final static ErrorCodeDTO Fail = new ErrorCodeDTO("500", "fail");
    public final static ErrorCodeDTO ParamError = new ErrorCodeDTO("501", "param error");

}