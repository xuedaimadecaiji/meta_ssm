package com.zeng.ssm.impl;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.dao.DeviceDao;
import com.zeng.ssm.dao.MaterialDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("modelDao")
public class ModelImpl implements ModelDao<Model, Integer> {

    private String tableName;

    @Resource
    MaterialDao materialDao;
    @Resource
    DeviceDao deviceDao;

    private ModelDao getModelDao() {
        switch (tableName) {
            case "material" :
                return this.materialDao;
            case "device" :
                return this.deviceDao;
        }
        return this.deviceDao;
    }

    @Override
    public void setTableName(String tableName) {
       this.tableName = tableName;
    }


    @Override
    public int deleteByPrimaryKey(Integer pk) {
        return getModelDao().deleteByPrimaryKey(pk);
    }

    @Override
    public int insert(Model record) {
        return getModelDao().insert(record);
    }

    @Override
    public int insert(List<Model> records) {
        return 0;
    }

    @Override
    public int insertSelective(Model record) {
        return 0;
    }

    @Override
    public List<Model> selectByContent(String content) {
        return null;
    }

    @Override
    public List<Model> selectAll() {
        return null;
    }

    @Override
    public Model selectByPrimaryKey(Integer pk) {
        return getModelDao().selectByPrimaryKey(pk);
    }

    @Override
    public int updateByPrimaryKeySelective(Model record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Model record) {
        return 0;
    }

}
