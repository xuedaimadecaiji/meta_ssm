package com.zeng.ssm.common;

import java.util.List;

public interface ModelDao<T> {

    int deleteByPrimaryKey(Integer pk);


    int insert(T record);
    int insert(List<T> records);

    int insertSelective(T record);

    List<T> selectByContent(String content);

//    List<AbstractModel> selectAllBySearch(QueryMap queryMap);

    List<T> selectAll();

    T selectByPrimaryKey(Integer pk);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}