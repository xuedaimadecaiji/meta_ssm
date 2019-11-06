package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.DataSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataSourceDao extends SQL<DataSource, Integer> {
}
