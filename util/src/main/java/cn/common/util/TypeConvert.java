package cn.common.util;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("类型转换")
public class TypeConvert {

    @ApiOperation("类型转换")
    public static <T> T get(Object obj, Class<T> clazz) {
        if (null == obj)
            return null;

        return JSON.toJavaObject((JSON) JSON.toJSON(obj), clazz);
    }

}