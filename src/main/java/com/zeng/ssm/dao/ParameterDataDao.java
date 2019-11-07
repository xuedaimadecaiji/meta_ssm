package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.ParameterData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParameterDataDao extends ModelDao<ParameterData, Integer> {
    List<ParameterData> selectParameterDataListBySceneDataId(Integer pk);
}
