package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class UnitCategory extends AbstractModel {

    private String title;
    private int unitCategoryId;
    private UnitCategory unitCategory;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUnitCategoryId() {
        return unitCategoryId;
    }

    public void setUnitCategoryId(int unitCategoryId) {
        this.unitCategoryId = unitCategoryId;
    }

    public UnitCategory getUnitCategory() {
        return unitCategory;
    }

    public void setUnitCategory(UnitCategory unitCategory) {
        this.unitCategory = unitCategory;
    }
}
