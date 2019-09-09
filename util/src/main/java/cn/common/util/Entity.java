package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@Api("数据库传输对象")
public class Entity implements Serializable {

    @ApiModelProperty("id")
    private Long id;

}