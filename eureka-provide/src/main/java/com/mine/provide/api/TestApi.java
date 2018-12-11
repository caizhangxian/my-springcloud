package com.mine.provide.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Company: 北京国文互联教育科技集团有限公司
 * @Author:caizhangxian
 * @Date: 15:10 2018/11/27
 */
@RequestMapping("/test")
@RestController
public class TestApi {
    @PostMapping("/getname")
    public  String getname(@RequestBody String id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("********************provide success********************");
        return "才彰显"+id;
    }
}
