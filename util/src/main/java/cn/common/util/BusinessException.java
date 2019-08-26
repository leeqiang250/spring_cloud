package cn.common.util;

import io.swagger.annotations.ApiModelProperty;

public class BusinessException extends RuntimeException {

    @ApiModelProperty("状态")
    private final String status;

    @ApiModelProperty("消息")
    private final String msg;

    public BusinessException(ErrorCodeDTO dto) {
        this.status = dto.getCode();
        this.msg = dto.getDesc();
    }

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}