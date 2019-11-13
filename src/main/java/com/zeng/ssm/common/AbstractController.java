package com.zeng.ssm.common;

import java.util.List;

public abstract class AbstractController<T, KEY> implements Controller<T, KEY> {

    @Override
    public List<T> getList() {
        return null;
    }



}
