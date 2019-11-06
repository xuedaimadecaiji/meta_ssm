package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.UsageEnumDao;
import com.zeng.ssm.model.UsageEnum;
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
@RequestMapping("/api/usage")
public class UsageEnumController extends AbstractController<UsageEnum, Integer> {

    @Resource
    UsageEnumDao usageEnumDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<UsageEnum> getList() {
        return this.usageEnumDao.selectAll();
    }

    @Override
    public UsageEnum get(Integer pk) {
        return null;
    }

    @Override
    public int post(UsageEnum record) {
        return 0;
    }

    @Override
    public int put(UsageEnum record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
