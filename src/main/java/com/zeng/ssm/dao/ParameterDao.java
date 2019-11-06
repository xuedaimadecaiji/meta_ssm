package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Parameter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ParameterDao extends SQL<Parameter, Integer> {
}
