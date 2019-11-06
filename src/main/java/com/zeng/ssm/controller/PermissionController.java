package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.PermissionDao;
import com.zeng.ssm.dao.PermissionOperationDao;
import com.zeng.ssm.model.Permission;
import com.zeng.ssm.model.PermissionOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/permission")
public class PermissionController extends AbstractController<Permission, Integer> {

    @Resource
    PermissionDao permissionDao;
    @Resource
    PermissionOperationDao permissionOperationDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<Permission> getList() {
        return this.permissionDao.selectAll();
    }

    @Override
    public Permission get(Integer pk) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @Override
    public int post(@RequestBody Permission record) {
        return this.permissionDao.insert(record);
    }

    @Override
    public int put(Permission record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }

    @RequestMapping(value = "/operation", method = RequestMethod.GET)
    public List<PermissionOperation> getOperationList() {
        return this.permissionOperationDao.selectAll();
    }
}
