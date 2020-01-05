package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

import java.util.List;

public class Category extends AbstractModel {

    private Integer parentId;
    private Category parent;
    private String title;
    private List<Category> children;
    private List<SceneData> sceneDataList;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<SceneData> getSceneDataList() {
        return sceneDataList;
    }

    public void setSceneDataList(List<SceneData> sceneDataList) {
        this.sceneDataList = sceneDataList;
    }
}
