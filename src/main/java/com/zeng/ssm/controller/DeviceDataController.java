package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.DeviceDataDao;
import com.zeng.ssm.model.DeviceData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/device_data")
public class DeviceDataController extends AbstractController<DeviceData, Integer> {

    @Resource
    DeviceDataDao deviceDataDao;

    @Override
    public DeviceData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody DeviceData record) {
        return this.deviceDataDao.insert(record);
    }

    @Override
    public int put(DeviceData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
