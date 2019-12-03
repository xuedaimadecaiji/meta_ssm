package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractModel;
import com.zeng.ssm.common.ModelHandler;
import com.zeng.ssm.dao.CategoryDao;
import com.zeng.ssm.dao.SystemTableDataDao;
import com.zeng.ssm.model.Category;
import com.zeng.ssm.model.SystemColumnData;
import com.zeng.ssm.model.SystemTableData;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/system")
public class SystemController {

    @Resource
    CategoryDao categoryDao;
    @Resource
    SystemTableDataDao systemTableDataDao;

    /**
     * 获取工艺大类的树状信息
     */
    @RequestMapping("/categories/tree")
    public List<Category> getTree() {
        return this.categoryDao.selectCategoryTree();
    }

    /**
     * 获取所有的表的数据（基础表和辅助表，数据表除外）
     */
    @RequestMapping("/all")
    public HashMap<String, List<AbstractModel>> getAll () {
        return ModelHandler.getAllTableData();
    }


    /**
     * 获取所有的表结构
     */
    @RequestMapping("/tables")
    public HashMap<String, AbstractModel> getSystemTable () {
        HashMap<String, AbstractModel> map = new HashMap<>();
        for (AbstractModel model : this.systemTableDataDao.selectAll()) {
            SystemTableData tableData = (SystemTableData) model;
            model.setTableName(ModelHandler.formatTableName(tableData.getTableName(), tableData.getSystemColumnList()));
            map.put(model.getTableName(), model);
        }
        return map;
    }
}