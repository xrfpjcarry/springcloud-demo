package com.panjiao.shop;

import com.panjiao.shop.dao.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.panjiao.shop.dao")

public class Application {

    @Autowired
    private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
