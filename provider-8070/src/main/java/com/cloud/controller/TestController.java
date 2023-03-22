package com.cloud.controller;

import com.cloud.service.FeignSerfvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private FeignSerfvice feignSerfvice;

    @RequestMapping("/test")
    public String test(){
        return feignSerfvice.getStr();
    }

    @RequestMapping("/test2")
    public String test2(){
        return feignSerfvice.getTest();
    }
}
