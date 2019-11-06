package com.zeng.ssm.model;

import com.zeng.ssm.common.Searchable;

public class Energy extends Searchable {

    private Integer id;
    private Integer energyCategoryId;
    private EnergyCategory energyCategory;
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
        return "energy";
    }

    public Integer getEnergyCategoryId() {
        return energyCategoryId;
    }

    public void setEnergyCategoryId(Integer energyCategoryId) {
        this.energyCategoryId = energyCategoryId;
    }

    public EnergyCategory getEnergyCategory() {
        return energyCategory;
    }

    public void setEnergyCategory(EnergyCategory energyCategory) {
        this.energyCategory = energyCategory;
    }
}
