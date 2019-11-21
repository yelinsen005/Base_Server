package com.example.demo01.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.demo01.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    /**
//     * 逻辑删除插件
//     */
//    @Bean
//    public LogicSqlInjector logicSqlInjector()
//    {
//        return new LogicSqlInjector();
//    }
//

//    @Bean
//    public MetaObjectHandler myMetaObjectHandler()
//    {
//        return new MetaObjectHandler()
//        {
//            @Override
//            public void insertFill(MetaObject metaObject)
//            {
//                User user = SessionUtil.currentUser();
//                this.setFieldValByName("deleted", 0, metaObject);
//                this.setFieldValByName("whenCreated", LocalDateTime.now(), metaObject);
//                this.setFieldValByName("whenModified", LocalDateTime.now(), metaObject);
//                Object whoCreated = this.getFieldValByName("whoCreated", metaObject);
//                if (whoCreated == null)
//                {
//                    this.setFieldValByName("whoCreated", user == null ? 0L : user.getId(), metaObject);
//                }
//                Object whoModified = this.getFieldValByName("whoModified", metaObject);
//                if (whoModified == null)
//                {
//                    this.setFieldValByName("whoModified", user == null ? 0L : user.getId(), metaObject);
//                }
//
//            }
//
//            @Override
//            public void updateFill(MetaObject metaObject)
//            {
//                User user = SessionUtil.currentUser();
//                this.setFieldValByName("whenModified", LocalDateTime.now(), metaObject);
//                this.setFieldValByName("whoModified", user == null ? 0L : user.getId(), metaObject);
//            }
//        };
//
//    }
}
