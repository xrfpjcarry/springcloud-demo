package com.panjiao.shop.dao;

import com.panjiao.shop.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xp
 * on 2019/3/8.
 */

@Mapper
public interface UserMapper {
    void addUser(UserDto user);

    UserDto getUserById(@Param("id") int id);
}
