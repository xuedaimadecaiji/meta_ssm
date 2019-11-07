package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.SystemColumn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemColumnDao extends ModelDao{

    /**
     * 查找tableName所有的列
     */
    List<SystemColumn> selectListByTableName (String TABLE_NAME);

}
