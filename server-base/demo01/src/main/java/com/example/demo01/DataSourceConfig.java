package com.example.demo01;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    public HikariDataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=UTF-8");
        dataSource.setUsername("guest");
        dataSource.setPassword("123456");
        dataSource.setMinimumIdle(5);
        dataSource.setIdleTimeout(180000);
        dataSource.setMaximumPoolSize(10);
        dataSource.setAutoCommit(true);
        dataSource.setPoolName("MyHikariCP");
        dataSource.setMaxLifetime(1800000);
        dataSource.setConnectionTimeout(3000);
        dataSource.setConnectionTestQuery("SELECT 1");
        return dataSource;
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
