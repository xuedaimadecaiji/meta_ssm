package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.ParameterData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParameterDataDao extends SQL<ParameterData, Integer> {
    List<ParameterData> selectParameterDataListBySceneDataId(Integer pk);
}
