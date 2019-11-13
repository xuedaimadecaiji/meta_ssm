package com.zeng.ssm.controller;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.common.ModelHandler;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/manage/{tableName}")
public class ManageController{

    @Resource
    ModelDao modelDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Model> getList(@PathVariable String tableName) {
        return this.modelDao.selectAll(tableName);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    public Model get(@PathVariable String tableName, @PathVariable Integer pk){
        return this.modelDao.selectByPrimaryKey(tableName, pk);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public int post(@PathVariable String tableName, @RequestBody String record){
        Model model = ModelHandler.makeModel(tableName, record);
        return this.modelDao.insert(tableName, model);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public int put(@PathVariable String tableName, @RequestBody String record){
        Model model = ModelHandler.makeModel(tableName, record);
        return this.modelDao.updateByPrimaryKey(tableName, model);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.DELETE)
    public  int delete(@PathVariable String tableName, @PathVariable Integer pk){
        return this.modelDao.deleteByPrimaryKey(tableName, pk);
    }
}
