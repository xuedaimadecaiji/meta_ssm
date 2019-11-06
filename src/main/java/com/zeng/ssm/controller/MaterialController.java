package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.MaterialDao;
import com.zeng.ssm.model.Material;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/material")
public class MaterialController extends AbstractController<Material, Integer> {

    @Resource
    MaterialDao materialDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Material> getList() {
        return this.materialDao.selectAll();
    }

    @Override
    public Material get(Integer pk) {
        return null;
    }

    @Override
    public int post(Material record) {
        return 0;
    }

    @Override
    public int put(Material record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
