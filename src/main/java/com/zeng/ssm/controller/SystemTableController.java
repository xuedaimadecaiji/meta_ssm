package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.SystemTableDao;
import com.zeng.ssm.model.SystemTable;
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
@RequestMapping("/api/system_table")
public class SystemTableController extends AbstractController<SystemTable, Integer> {

    @Resource
    SystemTableDao systemTableDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<SystemTable> getList() {
        return this.systemTableDao.selectAll();
    }

    @Override
    public SystemTable get(Integer pk) {
        return null;
    }

    @Override
    public int post(SystemTable record) {
        return 0;
    }

    @Override
    public int put(SystemTable record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
