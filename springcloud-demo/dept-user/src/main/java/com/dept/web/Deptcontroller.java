package com.dept.web;

import com.dept.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xp
 * on 2018/8/12.
 */
@RestController
public class Deptcontroller {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return userService.getMSG();
    }
}
