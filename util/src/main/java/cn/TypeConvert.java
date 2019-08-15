package cn;

import com.alibaba.fastjson.JSON;

public class TypeConvert {

    public static <T> T get(Object obj, Class<T> clazz) {
        if (null == obj)
            return null;

        return JSON.toJavaObject((JSON) JSON.toJSON(obj), clazz);
    }

}