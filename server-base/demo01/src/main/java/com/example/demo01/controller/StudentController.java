package com.example.demo01.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo01.bean.Student;
import com.example.demo01.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/getPage")
    public Object getPage() {
        Page<Student> page = new Page<>(1, 10);
        return studentService.getPage(page);
    }

    @GetMapping("/getByName")
    public Object listByName() {
        String name = "张三";
        return studentService.listByName(name);
    }

    @GetMapping("/getById")
    public Object getById() {
        Integer id = 1;
        return studentService.getById(id);
    }
}
