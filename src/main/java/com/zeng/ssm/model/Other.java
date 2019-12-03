package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;
import com.zeng.ssm.common.Searchable;

public class Other extends Searchable{

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getModelType() {
        return "other";
    }
}
