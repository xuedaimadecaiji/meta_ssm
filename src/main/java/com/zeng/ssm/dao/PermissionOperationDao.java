package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.PermissionOperation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionOperationDao extends SQL<PermissionOperation, Integer> {
}
