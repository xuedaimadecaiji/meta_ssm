package com.zeng.ssm.model;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.Searchable;

public class Other extends Searchable  implements Model {

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
        return "other";
    }
}
