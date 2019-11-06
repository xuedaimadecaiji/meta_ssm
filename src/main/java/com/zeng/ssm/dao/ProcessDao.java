package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Process;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProcessDao extends SQL<Process, Integer> {

    List<Process> selectProcessListBySceneId(Integer pk);
}
