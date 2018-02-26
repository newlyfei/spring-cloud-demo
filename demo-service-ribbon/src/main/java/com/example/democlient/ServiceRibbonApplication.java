package com.example.democlient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableHystrix  注解开启Hystrix
 * @EnableHystrixDashboard 开启Hystrix仪表盘，访问地址http://localhost:8764/hystrix
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix  //注解开启Hystrix
@EnableHystrixDashboard //开启Hystrix仪表盘
public class ServiceRibbonApplication {
    @Bean
    @LoadBalanced   //负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }
}
