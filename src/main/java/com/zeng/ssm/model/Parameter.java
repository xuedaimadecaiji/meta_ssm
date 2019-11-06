package com.zeng.ssm.model;

import com.zeng.ssm.common.Searchable;

public class Parameter extends Searchable {

    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getModelType() {
        return "parameter";
    }
}
