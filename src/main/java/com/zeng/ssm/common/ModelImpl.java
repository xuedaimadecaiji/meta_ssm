package com.zeng.ssm.common;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("modelDao")
public class ModelImpl implements ModelDao{

    @Override
    public int deleteByPrimaryKey(String tableName, Integer pk) {
        return ModelHandler.getModelDao(tableName).deleteByPrimaryKey(tableName, pk);
    }

    @Override
    public int insert(String tableName, Model record) {
        return ModelHandler.getModelDao(tableName).insert(tableName, record);
    }

    @Override
    public int insert(String tableName, List<Model> records) {
        return 0;
    }

    @Override
    public int insertSelective(String tableName, Model record) {
        return 0;
    }

    @Override
    public List<Model> selectByContent(String tableName, String content) {
        return null;
    }

    @Override
    public List<Model> selectAll(String tableName) {
        return ModelHandler.getModelDao(tableName).selectAll(tableName);
    }

    @Override
    public Model selectByPrimaryKey(String tableName, Integer pk) {
        return ModelHandler.getModelDao(tableName).selectByPrimaryKey(tableName, pk);
    }

    @Override
    public int updateByPrimaryKeySelective(String tableName, Model record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(String tableName, Model record) {
        return ModelHandler.getModelDao(tableName).updateByPrimaryKey(tableName, record);
    }


}
