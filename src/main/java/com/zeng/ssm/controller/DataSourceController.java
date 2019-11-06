package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.DataSourceDao;
import com.zeng.ssm.model.DataSource;
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
@RequestMapping("/api/data_source")
public class DataSourceController extends AbstractController<DataSource, Integer> {

    @Resource
    DataSourceDao dataSourceDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<DataSource> getList() {
        return this.dataSourceDao.selectAll();
    }

    @Override
    public DataSource get(Integer pk) {
        return null;
    }

    @Override
    public int post(DataSource record) {
        return 0;
    }

    @Override
    public int put(DataSource record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
