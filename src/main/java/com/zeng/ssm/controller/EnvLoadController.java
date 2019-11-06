package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.EnvLoadDao;
import com.zeng.ssm.model.EnvLoad;
import com.zeng.ssm.model.EnvLoadData;
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
@RequestMapping("/api/env_load")
public class EnvLoadController extends AbstractController<EnvLoad, Integer> {

    @Resource
    EnvLoadDao envLoadDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<EnvLoad> getList() {
        return this.envLoadDao.selectAll();
    }

    @Override
    public EnvLoad get(Integer pk) {
        return null;
    }

    @Override
    public int post(EnvLoad record) {
        return 0;
    }

    @Override
    public int put(EnvLoad record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
