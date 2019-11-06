package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.SceneData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SceneDataDao extends SQL<SceneData, Integer> {
    List<SceneData> selectAll(Integer categoryRootId);
}
