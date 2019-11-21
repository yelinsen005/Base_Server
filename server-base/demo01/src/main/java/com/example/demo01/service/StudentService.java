package com.example.demo01.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface StudentService {

    Object getPage(Page page);

    Object listByName(String name);

    Object getById(Integer id);
}
