package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.UserGroupDao;
import com.zeng.ssm.model.UserGroup;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/users/groups")
public class UserGroupController extends AbstractController<UserGroup, Integer> {

    @Resource
    UserGroupDao userGroupDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<UserGroup> getList() {
        return this.userGroupDao.selectAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<UserGroup> getListByUserId(@PathVariable Integer id) {
        return this.userGroupDao.selectListByUserId(id);
    }

    @Override
    public UserGroup get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody UserGroup record) {
        return this.userGroupDao.insert(record);
    }

    @Override
    public int put(UserGroup record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
