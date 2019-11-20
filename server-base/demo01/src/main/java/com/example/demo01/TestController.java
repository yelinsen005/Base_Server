package com.example.demo01;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@MapperScan("cn.net.conet.mybatisplus.mapper")
@RestController
public class TestController {

    /**
     * JdbcTemplate 是 core 包的核心类，用于简化 JDBC 操作，还能避免一些常见的错误，如忘记关闭数据库连接
     * Spring Boot 默认提供了数据源，默认提供了 org.springframework.jdbc.core.JdbcTemplate
     * JdbcTemplate 中会自己注入数据源，使用起来也不用再自己来关闭数据库连接
     */
    @Resource
    JdbcTemplate jdbcTemplate;


    @GetMapping("/say")
    public String say() {
        return "demo1 9001";
    }

    @GetMapping("phoneList")
    public List<Map<String, Object>> userList() {
        /**
         * 查询 phone 表所有数据
         * List 中的1个 Map 对应数据库的 1行数据
         * Map 中的 key 对应数据库的字段名，value 对应数据库的字段值
         */
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("SELECT * FROM student");
        return mapList;
    }
}
