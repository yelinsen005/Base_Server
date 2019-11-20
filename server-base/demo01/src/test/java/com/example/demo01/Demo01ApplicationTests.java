package com.example.demo01;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo01ApplicationTests {

    @Resource
    DataSource dataSource;

    @Test
    public void contextLoads() throws Exception {
        System.out.println("数据源》》》》" + dataSource.getClass());
        Connection connection=dataSource.getConnection();
        System.out.println("连接》》》》"+connection);
        System.out.println("连接地址》》》》"+connection.getMetaData().getURL());
        connection.close();
    }

}
