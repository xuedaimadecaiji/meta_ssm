package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends SQL<User, Integer> {

}
