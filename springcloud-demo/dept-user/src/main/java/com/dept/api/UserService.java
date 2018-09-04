package com.dept.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xp
 * on 2018/8/12.
 */
@FeignClient("computer-service1")
@Component
public interface UserService {

    @RequestMapping(value = "/xiaobao",method = RequestMethod.GET)
    String getMSG();

}
