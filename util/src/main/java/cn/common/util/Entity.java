package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Api("数据库传输对象")
public class Entity implements Serializable {

    @ApiModelProperty("id")
    private Long id;

}