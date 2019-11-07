package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.Other;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OtherDao extends ModelDao<Other, Integer> {
}
