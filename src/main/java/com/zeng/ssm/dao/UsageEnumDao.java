package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.UsageEnum;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UsageEnumDao extends SQL<UsageEnum, Integer> {

}
