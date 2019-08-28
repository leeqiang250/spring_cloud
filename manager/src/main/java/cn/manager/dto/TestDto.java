package cn.manager.dto;

import cn.common.util.Dto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Api("TestDto")
public class TestDto extends Dto {

    @ApiModelProperty("test")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}