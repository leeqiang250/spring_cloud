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

    public int getCurrentPageElementCount() {
        return currentPageElementCount;
    }

    public void setCurrentPageElementCount(int currentPageElementCount) {
        this.currentPageElementCount = currentPageElementCount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public long getTotalElementCount() {
        return totalElementCount;
    }

    public void setTotalElementCount(long totalElementCount) {
        this.totalElementCount = totalElementCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}