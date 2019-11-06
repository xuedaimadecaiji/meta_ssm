package com.zeng.ssm.model;

public class UnitCategory {

    private int id;
    private String title;
    private int unitCategoryId;
    private UnitCategory unitCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
