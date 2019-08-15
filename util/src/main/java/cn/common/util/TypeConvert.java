package cn.common.util;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;

@Api(description = "类型转换", tags = "类型转换")
public class TypeConvert {

    public static <T> T get(Object obj, Class<T> clazz) {
        if (null == obj)
            return null;

        return JSON.toJavaObject((JSON) JSON.toJSON(obj), clazz);
    }

}