package com.cloud.service.impl;

import com.cloud.service.FeignSerfvice;
import org.springframework.stereotype.Service;

@Service
public class FeignSerfviceImpl implements FeignSerfvice {
    @Override
    public String getStr() {
        return "服务调用success....";
    }

    @Override
    public String getTest() {
        return "-----test-----";
    }
}
