package com.tgram.base.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, RestClientAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class DemoServerApplication {
    @Resource
    private Environment env;
    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class,args);
    }


}
