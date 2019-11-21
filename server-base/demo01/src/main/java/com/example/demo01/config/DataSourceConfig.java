package com.example.demo01.config;

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
        dataSource.setDriverClassName(env.getProperty("db.driver"));
        dataSource.setJdbcUrl(env.getProperty("db.url"));
        dataSource.setUsername(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));
        dataSource.setMinimumIdle(env.getProperty("db.min-idle",int.class));
        dataSource.setIdleTimeout(env.getProperty("db.idle-timeout",int.class));
        dataSource.setMaximumPoolSize(env.getProperty("db.max-pool-size",int.class));
        dataSource.setAutoCommit(true);
        dataSource.setPoolName(env.getProperty("db.pool-name"));
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
