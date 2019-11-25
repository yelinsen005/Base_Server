package com.tgram.base.demo.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean
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



//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }

//    @Bean
//    public DataSourceProxy dataSourceProxy(DataSource dataSource) {
//        return new DataSourceProxy(dataSource);
//    }
//
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean(DataSourceProxy dataSourceProxy) throws Exception {
//        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
//        bean.setDataSource(dataSourceProxy);
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        // bean.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
//        bean.setMapperLocations(resolver.getResources("classpath*:mybatis/**/*-mapper.xml"));
//
//        SqlSessionFactory factory = null;
//        try {
//            factory = bean.getObject();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return factory;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSourceProxy){
//        return new JdbcTemplate(dataSourceProxy);
//    }
//
//    @Bean
//    public GlobalTransactionScanner globalTransactionScanner()
//    {
//        return new GlobalTransactionScanner("serverAddr","DEFAULT_GROUP");
//    }
}
