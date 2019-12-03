package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class Permission extends AbstractModel {

    private Integer permissionOperationId;
    private Integer categoryId;
    private String title;
    private String description;

    private Category category;
    private PermissionOperation permissionOperation;

    public Integer getPermissionOperationId() {
        return permissionOperationId;
    }

    public void setPermissionOperationId(Integer permissionOperationId) {
        this.permissionOperationId = permissionOperationId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public PermissionOperation getPermissionOperation() {
        return permissionOperation;
    }

    public void setPermissionOperation(PermissionOperation permissionOperation) {
        this.permissionOperation = permissionOperation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
