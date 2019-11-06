package com.zeng.ssm.controller;

import com.zeng.ssm.common.Searchable;
import com.zeng.ssm.dao.*;
import com.zeng.ssm.model.Material;
import com.zeng.ssm.model.MaterialData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/search")
public class SearchController {
    static List<Searchable> res = new ArrayList<>();

    @Resource
    SceneDataDao sceneDataDao;
    @Resource
    MaterialDao materialDao;
    @Resource
    DeviceDao deviceDao;
    @Resource
    EnergyDao energyDao;
    @Resource
    EnvLoadDao envLoadDao;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Searchable> search(@RequestParam("content") String content) {
        res.clear();
        res.addAll(this.sceneDataDao.selectByContent(content));
        if (content != null && !content.equals("")) {
            res.addAll(this.materialDao.selectByContent(content));
            res.addAll(this.energyDao.selectByContent(content));
            res.addAll(this.envLoadDao.selectByContent(content));
        }
        return res;
    }

}
