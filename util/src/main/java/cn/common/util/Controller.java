package cn.common.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class Controller<E extends Entity, D extends Dto> {

    public abstract Service<E, D> getService();

    @PostMapping("/addOrUpdate")
    @ApiOperation("增加或修改数据")
    public Response<Boolean> addOrUpdate(@ApiParam(required = true, value = "body") @RequestBody D d) {
        return Response.Success(getService().addOrUpdate(d));
    }

    @PostMapping("/deleteById/{id}")
    @ApiOperation("删除数据通过id")
    public Response<Boolean> deleteById(@ApiParam(required = true, value = "token") @RequestHeader(value = "token") String token, @ApiParam(required = true, value = "id") @PathVariable Long id) {
        return Response.Success(getService().deleteById(id));
    }

    @PostMapping("/deleteAll")
    @ApiOperation("删除全部数据")
    public Response<Boolean> deleteAll(@ApiParam(required = true, value = "token") @RequestHeader(value = "token") String token) {
        return Response.Success(getService().deleteAll());
    }

    @GetMapping("/getById/{id}")
    @ApiOperation("获取数据通过id")
    public Response<D> getById(@ApiParam(required = true, value = "token") @RequestHeader(value = "token") String token, @ApiParam(required = true, value = "id") @PathVariable Long id) {
        return Response.Success(getService().getById(id));
    }

    @GetMapping("/getPage")
    @ApiOperation("获取分页数据")
    public Response<cn.common.util.Page<D>> getPage(@ApiParam(required = true, value = "token") @RequestHeader(value = "token") String token, @ApiParam(required = true, value = "body") @RequestBody Pageable pageable) {
        return Response.Success(getService().getPage(pageable));
    }

    @GetMapping("/getAll")
    @ApiOperation("获取全部数据")
    public Response<List<D>> getAll(@ApiParam(required = true, value = "token") @RequestHeader(value = "token") String token) {
        return Response.Success(getService().getAll());
    }
}