package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.SystemTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemTableDao extends SQL<SystemTable, Integer> {
}
