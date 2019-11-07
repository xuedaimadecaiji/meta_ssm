package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.Process;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProcessDao extends ModelDao{

    List<Process> selectProcessListBySceneId(Integer pk);
}
