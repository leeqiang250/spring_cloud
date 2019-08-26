package cn.common.util;

import java.util.List;


public abstract class ServiceImpl<T> {

    public boolean add(T t) {
        return true;
    }

    public List<T> getAll() {
        return null;
    }

}