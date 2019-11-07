package com.zeng.ssm.common;

import java.util.List;

public interface ModelDao<T, KEY> {
    int deleteByPrimaryKey(KEY pk);

    int insert(T record);
    int insert(List<T> records);

    int insertSelective(T record);

    List<T> selectByContent(String content);

    List<T> selectAll();

    T selectByPrimaryKey(KEY pk);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}