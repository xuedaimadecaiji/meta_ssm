package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Energy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnergyDao extends SQL<Energy, Integer> {
}
