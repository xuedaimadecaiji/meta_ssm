package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends ModelDao<User, Integer> {

}
