package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@Api("业务异常")
public class BusinessException extends RuntimeException {

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("消息")
    private String msg;

    public BusinessException(ErrorCodeDTO dto) {
        this.status = dto.getCode();
        this.msg = dto.getDesc();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}