package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.EnvLoadDataDao;
import com.zeng.ssm.model.EnvLoadData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/env_load_data")
public class EnvLoadDataController extends AbstractController<EnvLoadData, Integer> {

    @Resource
    EnvLoadDataDao envLoadDataDao;

    @Override
    public EnvLoadData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody EnvLoadData record) {
        return this.envLoadDataDao.insert(record);
    }

    @Override
    public int put(EnvLoadData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
