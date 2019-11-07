package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.PermissionData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionDataDao extends ModelDao{

    List<PermissionData> selectListByGroupId(Integer userGroupId);
}
