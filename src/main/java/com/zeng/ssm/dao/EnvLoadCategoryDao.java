package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.EnvLoadCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnvLoadCategoryDao extends SQL<EnvLoadCategory, Integer> {
}
