package com.zeng.ssm.model;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.Searchable;

public class Material extends Searchable implements Model {

    private Integer id;
    private String title;
    private String description;
    private String type;
    private String origin;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getModelType() {
        return "material";
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
