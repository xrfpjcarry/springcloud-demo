package com.dept.deptService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xp
 * on 2018/8/12.
 */
@FeignClient("deptservice")
public interface DeptService {

    @RequestMapping(value = "/dept/test", method = RequestMethod.GET)
    public void getDeptMSG();
}
