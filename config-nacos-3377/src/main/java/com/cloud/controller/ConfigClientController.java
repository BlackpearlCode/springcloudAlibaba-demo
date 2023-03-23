package com.cloud.controller;

import com.cloud.entities.ConfigEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private ConfigEnt configInfo;

    @RequestMapping("/config/info")
    private String getConfigInfo(){
        System.out.println("------------"+configInfo+"---------");
        return configInfo.getName();
    }
}
