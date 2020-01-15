package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.common.AbstractModel;
import com.zeng.ssm.dao.SceneDao;
import com.zeng.ssm.model.Scene;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/scene")
public class SceneController extends AbstractController<Scene, Integer> {

    @Resource
    SceneDao sceneDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Scene> getList() {
        return this.sceneDao.selectAll();
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    @Override
    public Scene get(@PathVariable Integer pk) {
        return this.sceneDao.selectByPrimaryKey(pk);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody Scene record) {
        return this.sceneDao.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @Override
    public int put(@RequestBody Scene record) {
        return this.sceneDao.updateByPrimaryKey(record);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.DELETE)
    @Override
    public int delete(@PathVariable Integer pk) {
        return this.sceneDao.deleteByPrimaryKey(pk);
    }
}
