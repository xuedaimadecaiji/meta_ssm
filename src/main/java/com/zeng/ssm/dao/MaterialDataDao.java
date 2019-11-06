package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.MaterialData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MaterialDataDao extends SQL<MaterialData, Integer> {

    List<MaterialData> selectMaterialDataListBySceneDataId (Integer pk);

}
