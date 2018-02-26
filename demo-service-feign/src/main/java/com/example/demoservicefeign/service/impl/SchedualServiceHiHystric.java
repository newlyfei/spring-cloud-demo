package com.example.demoservicefeign.service.impl;

import com.example.demoservicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 该类是熔断器实现方法，服务调用失败时默认调用该默认方法
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
