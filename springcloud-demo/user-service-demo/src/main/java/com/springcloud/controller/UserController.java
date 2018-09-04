package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xp
 * on 2018/8/12.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/xiaobao",method = RequestMethod.GET)
    public String getMSG(){
        System.out.println("你访问到我了");
        return "我是用户,你访问到我了";
    }
}
