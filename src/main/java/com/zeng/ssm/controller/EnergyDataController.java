package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.EnergyDataDao;
import com.zeng.ssm.model.EnergyData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/energy_data")
public class EnergyDataController extends AbstractController<EnergyData, Integer> {

    @Resource
    EnergyDataDao energyDataDao;

    @Override
    public EnergyData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody EnergyData record) {
        return this.energyDataDao.insert(record);
    }

    @Override
    public int put(EnergyData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
