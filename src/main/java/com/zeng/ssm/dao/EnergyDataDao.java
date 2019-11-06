package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.DeviceData;
import com.zeng.ssm.model.EnergyData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnergyDataDao extends SQL<EnergyData, Integer> {
    List<EnergyData> selectEnergyDataListBySceneDataId (Integer pk);
}
