package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@Api("错误代码")
public class ErrorCodeDTO implements Serializable {

    @ApiModelProperty("状态码")
    private String code;

    @ApiModelProperty("描述")
    private String desc;

    public ErrorCodeDTO(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}