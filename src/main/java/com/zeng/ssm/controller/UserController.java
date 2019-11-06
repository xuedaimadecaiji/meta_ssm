package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.UserDao;
import com.zeng.ssm.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/users")
public class UserController extends AbstractController<User, Integer> {

    @Resource
    UserDao userDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<User> getList() {
        return this.userDao.selectAll();
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<User> getListByContent(@RequestParam("content") String content) {
        return this.userDao.selectByContent(content);
    }

    @RequestMapping(value = "/{pk}", method = RequestMethod.GET)
    @Override
    public User get(@PathVariable Integer pk) {
        return this.userDao.selectByPrimaryKey(pk);
    }

    @Override
    public int post(User record) {
        return 0;
    }

    @Override
    public int put(User record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
