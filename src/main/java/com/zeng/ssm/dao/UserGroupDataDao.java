package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.UserGroupData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserGroupDataDao extends SQL<UserGroupData, Integer> {
    List<UserGroupData> selectListByUserId (Integer userId);
}
