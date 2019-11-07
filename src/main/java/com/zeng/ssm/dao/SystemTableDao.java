package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.SystemTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemTableDao extends ModelDao<SystemTable, Integer> {
}
