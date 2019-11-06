package com.zeng.ssm.controller;

import com.zeng.ssm.common.AbstractController;
import com.zeng.ssm.model.Process;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/process")
public class ProcessController extends AbstractController<Process, Integer> {
    @Override
    public Process get(Integer pk) {
        return null;
    }

    @Override
    public int post(Process record) {
        return 0;
    }

    @Override
    public int put(Process record) {
        return 0;
    }

    @Override
    public int delete(Integer pk) {
        return 0;
    }
}
