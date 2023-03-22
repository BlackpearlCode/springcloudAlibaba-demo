package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "consul-provider-payment")
public interface FeginService {
    @RequestMapping("/test")
    public String test();
}
