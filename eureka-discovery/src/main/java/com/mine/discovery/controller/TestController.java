package com.mine.discovery.controller;

import com.mine.discovery.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author:caizhangxian
 * @Date: 10:07 2018/11/26
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService testService;
    @GetMapping("/getname")
    public String getName(){

        return testService.findById("dd");
    }
}
