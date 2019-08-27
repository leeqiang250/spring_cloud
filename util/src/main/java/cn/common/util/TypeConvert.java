package cn.common.util;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;

@Api("类型转换")
public class TypeConvert {

    @ApiOperation("类型转换")
    public static <T> T get(Object obj, Class<T> clazz) {
        if (obj == null)
            return null;

        return JSON.toJavaObject((JSON) JSON.toJSON(obj), clazz);
    }

    @ApiOperation("类型转换")
    public static <T> T parse(String obj, Class<T> clazz) {
        if (StringUtils.isEmpty(obj))
            return null;

        return JSON.parseObject(obj, clazz);
    }

}