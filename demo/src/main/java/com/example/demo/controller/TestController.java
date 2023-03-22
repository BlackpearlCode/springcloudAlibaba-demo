package com.example.demo.controller;


import com.example.demo.service.FeignSerfvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private FeignSerfvice feignSerfvice;

//    @GetMapping("/test")
//    public String test(){
//        return feignSerfvice.test();
//    }
}
