package com.dept.deptService.DeptServiceImpl;

import com.dept.deptService.DeptService;
import org.springframework.stereotype.Service;

/**
 * Created by xp
 * on 2018/8/12.
 */
@Service
//@RestController
public class DeptServicempl implements DeptService {
    @Override
    public void getDeptMSG() {
        System.out.println("我是部门, 你调用到我了");
    }
}
