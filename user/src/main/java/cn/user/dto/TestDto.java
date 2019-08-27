package cn.user.dto;

import cn.common.util.Dto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
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