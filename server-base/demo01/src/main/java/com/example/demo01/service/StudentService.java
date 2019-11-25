package com.example.demo01.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo01.bean.Student;

public interface StudentService {

    Object getPage(Page page);

    Object listByName(String name);

    Object getById(Integer id);

    void insertWithID(Student student);
}
