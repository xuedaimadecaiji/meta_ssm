package com.zeng.ssm.common;

import java.util.List;

public interface Controller<T, KEY>{
    public abstract List<T> getList();
    public abstract T get(KEY pk);
    public abstract int post(T record);
    public abstract int put(T record);
    public abstract int delete(KEY pk);
}
