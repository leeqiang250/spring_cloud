package cn.common.util;

import java.util.List;

public interface Service<T> {

    boolean add(T t);

    List<T> getAll();

}