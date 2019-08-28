package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Api("Service")
public interface Service<E extends Entity, D extends Dto> {

    @Transactional
    @ApiOperation("增加或修改数据")
    boolean addOrUpdate(D d);

    @Transactional
    @ApiOperation("删除数据通过id")
    boolean deleteById(Long id);

    @Transactional
    @ApiOperation("删除全部数据")
    boolean deleteAll();

    @ApiOperation("获取数据通过id")
    D getById(Long id);

    @ApiOperation("获取分页数据")
    cn.common.util.Page<D> getPage(Pageable pageable);

    @ApiOperation("获取全部数据")
    List<D> getAll();

}