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
public class CategoryController{

    @Resource
    CategoryDao categoryDao;

    @RequestMapping("/tree")
    public List<Category> getTree() {
        return this.categoryDao.selectCategoryTree();
    }
}