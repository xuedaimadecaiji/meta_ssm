package com.zeng.ssm.controller;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.ModelDao;
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
        this.modelDao.setTableName(tableName);
        return this.modelDao.selectAll();
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    public Model get(@PathVariable String tableName, @PathVariable Integer pk){
        this.modelDao.setTableName(tableName);
        return this.modelDao.selectByPrimaryKey(pk);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public int post(@PathVariable String tableName, @RequestBody Model record){
        this.modelDao.setTableName(tableName);
        return this.modelDao.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public  int put(@PathVariable String tableName, @RequestBody Model record){
        this.modelDao.setTableName(tableName);
        return this.modelDao.updateByPrimaryKey(record);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.DELETE)
    public  int delete(@PathVariable String tableName, @PathVariable Integer pk){
        this.modelDao.setTableName(tableName);
        return this.modelDao.deleteByPrimaryKey(pk);
    }
}
