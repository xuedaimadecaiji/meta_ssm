package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.common.Model;
import com.zeng.ssm.dao.CategoryDao;
import com.zeng.ssm.model.Category;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/manage/categories")
public class CategoryController extends AbstractController<Model, Integer> {

    @Resource
    CategoryDao categoryDao;

    @RequestMapping("/tree")
    public List<Category> getTree() {
        return this.categoryDao.selectCategoryTree();
    }

    @RequestMapping("")
    @Override
    public List<Model> getList() {
        return this.categoryDao.selectAll();
    }

    @RequestMapping("/{pk}")
    @Override
    public Model get(@PathVariable Integer pk) {
        return this.categoryDao.selectByPrimaryKey(pk);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public int post(@RequestBody Model record) {
        return this.categoryDao.insert(record);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    @Override
    public int put(@RequestBody Model record) {
        return this.categoryDao.updateByPrimaryKey(record);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.DELETE)
    @Override
    public int delete(@PathVariable Integer pk) {
        return this.categoryDao.deleteByPrimaryKey(pk);
    }
}