package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.dao.CollectReasonDao;
import com.zeng.ssm.dao.DataSourceDao;
import com.zeng.ssm.model.CollectReason;
import com.zeng.ssm.model.DataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/collect_reason")
public class CollectReasonController extends AbstractController<CollectReason, Integer> {

    @Resource
    CollectReasonDao collectReasonDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Override
    public List<CollectReason> getList() {
        return this.collectReasonDao.selectAll();
    }

    @Override
    public CollectReason get(Integer pk) {
        return null;
    }

    @Override
    public int post(CollectReason record) {
        return 0;
    }

    @Override
    public int put(CollectReason record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
