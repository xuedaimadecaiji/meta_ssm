package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.OtherDataDao;
import com.zeng.ssm.model.OtherData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/other_data")
public class OtherDataController extends AbstractController<OtherData, Integer> {

    @Resource
    OtherDataDao otherDataDao;

    @Override
    public OtherData get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody OtherData record) {
        return this.otherDataDao.insert(record);
    }

    @Override
    public int put(OtherData record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
