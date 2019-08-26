package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@Api(description = "数据传输响应对象", tags = "数据传输响应对象")
public class Response<T> implements Serializable {

    @ApiModelProperty("状态")
    private final String status;

    @ApiModelProperty("消息")
    private final String msg;

    @ApiModelProperty("内容")
    private final T data;

    public Response(ErrorCodeDTO dto) {
        this(dto, null);
    }

    public Response(ErrorCodeDTO dto, T data) {
        this.status = dto.getCode();
        this.msg = dto.getDesc();
        this.data = data;
    }

    public static Response<Boolean> Success() {
        return Success(Boolean.TRUE);
    }

    public static Response<Boolean> Success(boolean value) {
        return Success(new Boolean(value));
    }

    public static Response<Integer> Success(int value) {
        return Success(new Integer(value));
    }

    public static Response<Long> Success(long value) {
        return Success(new Long(value));
    }

    public static <T> Response<T> Success(T data) {
        return new Response<T>(ErrorCode.Success, data);
    }

    public static Response<Boolean> Fail() {
        return Fail(Boolean.FALSE);
    }

    public static <T> Response<T> Fail(T data) {
        return new Response<T>(ErrorCode.Fail, data);
    }

}