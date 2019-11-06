package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Device;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeviceDao extends SQL<Device, Integer> {
}
