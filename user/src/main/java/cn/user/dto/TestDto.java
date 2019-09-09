package cn.user.dto;

import cn.common.util.Dto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Api("TestDto")
public class TestDto extends Dto {

    @ApiModelProperty("test")
    private String test;

}