package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.UserGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserGroupDao extends ModelDao{

    /**
     * 查找userId创建的所有组
     */
    List<UserGroup> selectListByUserId (Integer userId);

}
