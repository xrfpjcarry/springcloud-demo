package com.panjiao.shop.web;

import com.panjiao.shop.dto.UserDto;
import com.panjiao.shop.service.UserService;
import com.panjiao.shop.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xp
 * on 2019/3/8.
 */
@RestController
@RequestMapping("/user")
public class UerController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    //新增用户接口
    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDto user){
        String s = Md5Util.Md5Ecoding(user.getName(), user.getPassWord());
        user.setPassWord(s);
        userService.addUser(user);
    }
    //用户详情查询接口
    @GetMapping("/getUser/{id}")
    public UserDto getUserById(@PathVariable("id") int id){
        UserDto userDetial = userService.getUserById(id);
        redisTemplate.opsForValue().set("user",userDetial);
        return userDetial;
    }

}
