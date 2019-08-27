package cn.common.util;

import io.swagger.annotations.Api;

@Api("错误代码列表")
public class ErrorCode {

    public final static ErrorCodeDTO Success = new ErrorCodeDTO("200", "success");
    public final static ErrorCodeDTO Fail = new ErrorCodeDTO("500", "fail");
    public final static ErrorCodeDTO ParamError = new ErrorCodeDTO("501", "param error");
    public final static ErrorCodeDTO Forbid = new ErrorCodeDTO("502", "forbid");

}