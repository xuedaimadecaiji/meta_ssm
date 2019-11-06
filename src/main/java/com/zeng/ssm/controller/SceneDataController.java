package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.SceneDataDao;
import com.zeng.ssm.model.SceneData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/scene_data")
public class SceneDataController extends AbstractController<SceneData, Integer> {

    @Resource
    SceneDataDao sceneDataDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<SceneData> getList(@RequestParam("category") Integer categoryRootId) {
        return this.sceneDataDao.selectAll(categoryRootId);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    @Override
    public SceneData get(@PathVariable Integer pk) {
        return this.sceneDataDao.selectByPrimaryKey(pk);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public int post(@RequestBody SceneData record) {
        this.sceneDataDao.insert(record);
        return record.getId();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    @Override
    public int put(@RequestBody SceneData record) {
        return this.sceneDataDao.updateByPrimaryKey(record);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.DELETE)
    @Override
    public int delete(@PathVariable Integer pk) {
        return 0;
    }
}
