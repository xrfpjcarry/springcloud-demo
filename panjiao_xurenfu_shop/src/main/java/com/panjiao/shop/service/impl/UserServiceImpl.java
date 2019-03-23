package com.panjiao.shop.service.impl;

import com.panjiao.shop.dao.UserMapper;
import com.panjiao.shop.dto.UserDto;
import com.panjiao.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xp
 * on 2019/3/8.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(UserDto user) {
        userMapper.addUser(user);
    }

    @Override
    public UserDto getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
