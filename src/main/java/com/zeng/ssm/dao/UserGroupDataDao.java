package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.UserGroupData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserGroupDataDao extends ModelDao{
    List<UserGroupData> selectListByUserId (Integer userId);
}
