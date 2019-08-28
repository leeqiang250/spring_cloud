package cn.common.util;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

@Data
@Api("分页传输对象")
public class Pageable implements Serializable {

    @ApiModelProperty("分页页码")
    private int pageNumber = 1;

    @ApiModelProperty("分页大小")
    private int pageSize = 10;

    @ApiModelProperty("排序条件")
    private Sort sort;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}