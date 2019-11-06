package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.CollectReason;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectReasonDao extends SQL<CollectReason, Integer> {
}
