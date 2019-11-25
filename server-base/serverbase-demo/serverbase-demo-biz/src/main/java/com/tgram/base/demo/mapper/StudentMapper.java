package com.tgram.base.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tgram.base.demo.entity.Student;


public interface StudentMapper extends BaseMapper<Student> {
    Student getById(Integer id);

    void insertWithID(Student student);
}
