package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.ParameterDataDao;
import com.zeng.ssm.model.ParameterData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/parameter_data")
public class ParameterDataController extends AbstractController<ParameterData, Integer> {

    @Resource
    ParameterDataDao parameterDataDao;

    @Override
    public ParameterData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody ParameterData record) {
        return this.parameterDataDao.insert(record);
    }

    @Override
    public int put(ParameterData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
