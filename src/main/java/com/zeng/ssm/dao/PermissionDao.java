package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionDao extends SQL<Permission, Integer> {
}
