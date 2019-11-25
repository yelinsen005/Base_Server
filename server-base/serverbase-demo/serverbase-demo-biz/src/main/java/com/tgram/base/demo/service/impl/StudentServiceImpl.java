package com.tgram.base.demo.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tgram.base.demo.entity.Student;
import com.tgram.base.demo.mapper.StudentMapper;
import com.tgram.base.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Object getPage(Page page) {
        return studentMapper.selectPage(page, null);
    }

    @Override
    public Object listByName(String name) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name", name);
        return studentMapper.selectList(queryWrapper);
    }

    @Override
    public Object getById(Integer id) {

        return studentMapper.getById(id);
    }

    @Override
    public void insertWithID(Student student) {
        studentMapper.insertWithID(student);
    }
}

