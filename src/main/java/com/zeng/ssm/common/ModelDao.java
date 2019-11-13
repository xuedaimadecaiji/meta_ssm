package com.zeng.ssm.common;

import java.util.List;

public interface ModelDao {
    int deleteByPrimaryKey(String tableName, Integer pk);

    int insert(String tableName, Model record);
    int insert(String tableName, List<Model> records);

    int insertSelective(String tableName, Model record);

    List<Model> selectByContent(String tableName, String content);

    List<Model> selectAll(String tableName);

    Model selectByPrimaryKey(String tableName, Integer pk);

    int updateByPrimaryKeySelective(String tableName, Model record);

    int updateByPrimaryKey(String tableName, Model record);
}