package com.panjiao.shop.service;

import com.panjiao.shop.dto.UserDto;

/**
 * Created by xp
 * on 2019/3/8.
 */
public interface UserService {
    void addUser(UserDto user);

    UserDto getUserById(int id);
}
