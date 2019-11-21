package com.example.demo01.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 自己调用自己的测试服务
 */
@FeignClient(name = "demo01")
public interface DemoClient {
    @RequestMapping(value = "/phoneList")
    List<Map<String, Object>> userList();

    @RequestMapping(value = "/save2")
    void save2();
}
