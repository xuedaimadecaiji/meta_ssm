package com.zeng.ssm.impl;

import com.zeng.ssm.common.Model;
import com.zeng.ssm.common.ModelDao;
import com.zeng.ssm.dao.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("modelDao")
public class ModelImpl implements ModelDao{

    private String tableName;

    @Override
    public void setTableName(String tableName) {
       this.tableName = tableName;
    }

    @Override
    public int deleteByPrimaryKey(Integer pk) {
        return getModelDao().deleteByPrimaryKey(pk);
    }

    @Override
    public int insert(Model record) {
        return getModelDao().insert(record);
    }

    @Override
    public int insert(List<Model> records) {
        return 0;
    }

    @Override
    public int insertSelective(Model record) {
        return 0;
    }

    @Override
    public List<Model> selectByContent(String content) {
        return null;
    }

    @Override
    public List<Model> selectAll() {
        return this.getModelDao().selectAll();
    }

    @Override
    public Model selectByPrimaryKey(Integer pk) {
        return getModelDao().selectByPrimaryKey(pk);
    }

    @Override
    public int updateByPrimaryKeySelective(Model record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Model record) {
        return getModelDao().updateByPrimaryKey(record);
    }

    @Resource
    CategoryDao categoryDao;
    @Resource
    CollectReasonDao collectReasonDao;
    @Resource
    DataSourceDao dataSourceDao;
    @Resource
    DeviceDataDao deviceDataDao;
    @Resource
    DeviceDao deviceDao;
    @Resource
    EnergyDataDao energyDataDao;
    @Resource
    EnergyDao energyDao;
    @Resource
    EnvLoadCategoryDao envLoadCategoryDao;
    @Resource
    EnvLoadDataDao envLoadDataDao;
    @Resource
    EnvLoadDao envLoadDao;
    @Resource
    MaterialDataDao materialDataDao;
    @Resource
    MaterialDao materialDao;
    @Resource
    OtherDataDao otherDataDao;
    @Resource
    OtherDao otherDao;
    @Resource
    ParameterDataDao parameterDataDao;
    @Resource
    ParameterDao parameterDao;
    @Resource
    PermissionDataDao permissionDataDao;
    @Resource
    PermissionOperationDao permissionOperationDao;
    @Resource
    ProcessDao processDao;
    @Resource
    SceneDataDao sceneDataDao;
    @Resource
    SystemColumnDao systemColumnDao;
    @Resource
    SystemTableDao systemTableDao;
    @Resource
    UnitDao unitDao;
    @Resource
    UserGroupDataDao userGroupDataDao;
    @Resource
    UserGroupDao userGroupDao;
    @Resource
    UserDao userDao;

    private ModelDao getModelDao() {
        switch (tableName) {
            case "category" :
                return this.categoryDao;
            case "collect_reason" :
                return this.collectReasonDao;
            case "data_source" :
                return this.dataSourceDao;
            case "device" :
                return this.deviceDao;
            case "device_data" :
                return this.deviceDataDao;
            case "energy" :
                return this.energyDao;
            case "energy_data" :
                return this.energyDataDao;
            case "env_load_category" :
                return this.envLoadCategoryDao;
            case "env_load" :
                return this.envLoadDao;
            case "env_load_data" :
                return this.envLoadDataDao;
            case "material" :
                return this.materialDao;
            case "material_data" :
                return this.materialDataDao;
            case "other" :
                return this.otherDao;
            case "other_data" :
                return this.otherDataDao;
            case "parameter" :
                return this.parameterDao;
            case "parameter_data" :
                return this.parameterDataDao;
            case "permission_data" :
                return this.permissionDataDao;
            case "permission_operation" :
                return this.permissionOperationDao;
            case "process" :
                return this.processDao;
            case "scene_data" :
                return this.sceneDataDao;
            case "system_column" :
                return this.systemColumnDao;
            case "system_table" :
                return this.systemTableDao;
            case "unit" :
                return this.unitDao;
            case "user" :
                return this.userDao;
            case "user_group" :
                return this.userGroupDao;
            case "user_group_data" :
                return this.userGroupDataDao;
        }
        return this.deviceDao;
    }
}
