package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.EnergyDao;
import com.zeng.ssm.model.Energy;
import com.zeng.ssm.model.EnergyData;
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
@RequestMapping("/api/energy")
public class EnergyController extends AbstractController<Energy, Integer> {

    @Resource
    EnergyDao energyDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Energy> getList() {
        return this.energyDao.selectAll();
    }

    @Override
    public Energy get(Integer pk) {
        return null;
    }

    @Override
    public int post(Energy record) {
        return 0;
    }

    @Override
    public int put(Energy record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
