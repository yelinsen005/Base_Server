package com.tgram.base.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tgram.base.demo.entity.Student;

public interface StudentService {

    Object getPage(Page page);

    Object listByName(String name);

    Object getById(Integer id);

    void insertWithID(Student student);
}
