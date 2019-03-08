package com.panjiao.shop.web;


import com.panjiao.shop.myPractices.exception.ExceptionEnum;
import com.panjiao.shop.myPractices.exception.GlobException;
import com.panjiao.shop.myPractices.kafkaDemo.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xp
 * on 2019/3/1.
 */
@RequestMapping("/exception")
@RestController
public class TestController {
    @GetMapping
    public Product getExceptionMsg(){
        try {
            int t = 0;
            int r = 9;
            int g = r/t;
        }catch (Exception e){
            throw new GlobException(ExceptionEnum.PRIMARY_SCHOOL);
        }

        return new Product();
    }
}
