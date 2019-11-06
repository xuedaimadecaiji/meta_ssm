package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.DeviceDao;
import com.zeng.ssm.model.Device;
import com.zeng.ssm.model.DeviceData;
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
@RequestMapping("/api/device")
public class DeviceController extends AbstractController<Device, Integer> {

    @Resource
    DeviceDao deviceDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Device> getList() {
        return this.deviceDao.selectAll();
    }

    @Override
    public Device get(Integer pk) {
        return null;
    }

    @Override
    public int post(Device record) {
        return 0;
    }

    @Override
    public int put(Device record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
