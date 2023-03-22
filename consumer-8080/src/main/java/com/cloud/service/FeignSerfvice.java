package com.cloud.service;


import org.springframework.cloud.openfeign.FeignClient;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@FeignClient(value = "nacos-service-provider")
public interface FeignSerfvice {

    @RequestMapping("/test")
    String test();

    @RequestMapping("/test2")
    public String test2();
}
