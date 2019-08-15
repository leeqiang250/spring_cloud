package cn.common.util;

import io.swagger.annotations.Api;
import lombok.Data;

import java.io.Serializable;

@Data
@Api(description = "错误代码", tags = "错误代码")
public class ErrorCodeDTO implements Serializable {

    private String code;

    private String desc;

    public ErrorCodeDTO(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}