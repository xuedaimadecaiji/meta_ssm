package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.MaterialDataDao;
import com.zeng.ssm.model.MaterialData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/material_data")
public class MaterialDataController extends AbstractController<MaterialData, Integer> {

    @Resource
    MaterialDataDao materialDataDao;

    @Override
    public MaterialData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody MaterialData record) {
        return this.materialDataDao.insert(record);
    }

    @Override
    public int put(MaterialData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
