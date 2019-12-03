package com.zeng.ssm.dao;

import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.model.MaterialLoad;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MaterialLoadDao extends ModelDao{
    List<MaterialLoad> selectMaterialLoadListByMaterialId(Integer pk);
}
