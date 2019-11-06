package com.zeng.ssm.common;

import java.util.List;

public abstract class AbstractSQL implements SQL{

    @Override
    public int insert(List records) {
        return 0;
    }
}
