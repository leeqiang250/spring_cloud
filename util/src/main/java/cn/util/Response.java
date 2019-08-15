package cn.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private final String status;

    private final String msg;

    private final T data;

    public Response(ResponseCode code) {
        this(code, null);
    }

    public Response(ResponseCode code, T data) {
        this.status = code.getCode();
        this.msg = code.getDesc();
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
        return new Response<T>(ResponseCode.SUCCESS, data);
    }

    public static Response<Boolean> Fail() {
        return Fail(Boolean.FALSE);
    }

    public static <T> Response<T> Fail(T data) {
        return new Response<T>(ResponseCode.FAIL, data);
    }

}