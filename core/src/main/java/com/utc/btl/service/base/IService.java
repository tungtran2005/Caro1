package com.utc.btl.service.base;

import java.util.List;

public interface IService<T, ID> {

    T create(T t);
    T find(ID id);
    List<T> list();
    T update(T t);
    void delete(ID id);
}
