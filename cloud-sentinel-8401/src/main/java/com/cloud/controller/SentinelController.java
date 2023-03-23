package com.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @RequestMapping("/test1")
    public String getTest1(){
        return "test1---->";
    }

    @RequestMapping("/test2")
    public String getTest2(){
        return "test2---->";
    }
}
