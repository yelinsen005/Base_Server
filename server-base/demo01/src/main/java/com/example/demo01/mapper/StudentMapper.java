package com.example.demo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo01.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface  StudentMapper  extends BaseMapper<Student>{

    @Select("select * from student")
    Object listByName(String name);
}
