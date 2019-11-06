package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.EnergyData;
import com.zeng.ssm.model.EnvLoadData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnvLoadDataDao extends SQL<EnvLoadData, Integer> {
    List<EnvLoadData> selectEnvLoadDataListBySceneDataId (Integer pk);
}
