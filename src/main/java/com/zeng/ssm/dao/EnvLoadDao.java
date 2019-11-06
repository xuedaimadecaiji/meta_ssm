package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.EnvLoad;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnvLoadDao extends SQL<EnvLoad, Integer> {
}
