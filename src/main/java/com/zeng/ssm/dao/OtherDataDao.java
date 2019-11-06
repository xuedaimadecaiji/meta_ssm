package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.OtherData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OtherDataDao extends SQL<OtherData, Integer> {
    List<OtherData> selectOtherDataListBySceneDataId(Integer pk);
}
