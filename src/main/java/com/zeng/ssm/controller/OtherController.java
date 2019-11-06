package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.OtherDao;
import com.zeng.ssm.dao.ParameterDao;
import com.zeng.ssm.model.Other;
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
@RequestMapping("/api/other")
public class OtherController extends AbstractController<Other, Integer> {

    @Resource
    OtherDao otherDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Other> getList() {
        return this.otherDao.selectAll();
    }

    @Override
    public Other get(Integer pk) {
        return null;
    }

    @Override
    public int post(Other record) {
        return 0;
    }

    @Override
    public int put(Other record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
