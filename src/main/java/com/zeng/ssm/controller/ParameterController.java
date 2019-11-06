package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.ParameterDao;
import com.zeng.ssm.model.Parameter;
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
@RequestMapping("/api/parameter")
public class ParameterController extends AbstractController<Parameter, Integer> {

    @Resource
    ParameterDao parameterDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Parameter> getList() {
        return this.parameterDao.selectAll();
    }

    @Override
    public Parameter get(Integer pk) {
        return null;
    }

    @Override
    public int post(Parameter record) {
        return 0;
    }

    @Override
    public int put(Parameter record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
