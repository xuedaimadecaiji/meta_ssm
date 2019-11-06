package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.UnitDao;
import com.zeng.ssm.model.Unit;
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
@RequestMapping("/api/unit")
public class UnitController extends AbstractController<Unit, Integer> {

    @Resource
    UnitDao unitDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Unit> getList() {
        return this.unitDao.selectAll();
    }

    @Override
    public Unit get(Integer pk) {
        return null;
    }

    @Override
    public int post(Unit record) {
        return 0;
    }

    @Override
    public int put(Unit record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
