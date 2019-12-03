package com.zeng.ssm.common;

public class Searchable extends AbstractModel{
    private String modelTitle;
    private String modelName;
    private String modelType;

    public String getModelType() {
        return "manage";
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
}
