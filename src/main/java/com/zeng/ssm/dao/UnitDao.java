package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Unit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UnitDao extends SQL<Unit, Integer> {
}
