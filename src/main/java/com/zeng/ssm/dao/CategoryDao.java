package com.zeng.ssm.dao;

import com.zeng.ssm.common.SQL;
import com.zeng.ssm.model.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao extends SQL<Category, Integer> {

    List<Category> selectCategoryTree();

    List<Category> selectCategoriesByCategoryId(Integer id);

}
