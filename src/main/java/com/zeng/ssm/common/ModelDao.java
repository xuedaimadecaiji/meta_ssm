package com.zeng.ssm.common;

import java.util.List;

public interface ModelDao {
    int deleteByPrimaryKey(Integer pk);

    int insert(Model record);
    int insert(List<Model> records);

    int insertSelective(Model record);

    List<Model> selectByContent(String content);

    List<Model> selectAll();

    Model selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);

    void setTableName(String tableName);
}