package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Api("分页传输对象")
public class Page<T> implements Serializable {

    @ApiModelProperty("分页页码")
    private int pageNumber;

    @ApiModelProperty("分页大小")
    private int pageSize;

    @ApiModelProperty("当页数量")
    private int currentPageElementCount;

    @ApiModelProperty("总页码")
    private int totalPageCount;

    @ApiModelProperty("总数量")
    private long totalElementCount;

    @ApiModelProperty("数据")
    private List<T> data;

}