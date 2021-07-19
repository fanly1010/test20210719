package com.fly.www.test;

import com.fly.www.common.permission.PreAuthorize;
import com.fly.www.common.permission.limit.annotations.AccessLimit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/test")
    @AccessLimit//限流
    @PreAuthorize(hasPermi="test")//设置权限
    public  String test(){

        return "test";
    }
}
