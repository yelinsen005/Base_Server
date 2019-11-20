package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo01.bean.Student;
import com.example.demo01.mapper.StudentMapper;
import com.example.demo01.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Object listAll(int page, int size) {
        Page pageObj = new Page(page, size);
        return studentMapper.selectPage(pageObj, null);
    }

    @Override
    public Object listByName(int page, int size) {

        Object o=studentMapper.selectList(new QueryWrapper<Student>().eq("name","张三"));
        return o;
    }
}
