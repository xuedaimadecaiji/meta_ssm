package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

/**
 * 单位表
 */
public class Unit extends  AbstractModel {
    private String title;
    private String unitCategoryId;
    private UnitCategory unitCategory;

    public UnitCategory getUnitCategory() {
        return unitCategory;
    }

    public void setUnitCategory(UnitCategory unitCategory) {
        this.unitCategory = unitCategory;
    }

    public String getUnitCategoryId() {
        return unitCategoryId;
    }

    public void setUnitCategoryId(String unitCategoryId) {
        this.unitCategoryId = unitCategoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
