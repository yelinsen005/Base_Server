package com.example.demo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo01.bean.Student;


public interface StudentMapper extends BaseMapper<Student> {
    Student getById(Integer id);

    void insertWithID(Student student);
}
