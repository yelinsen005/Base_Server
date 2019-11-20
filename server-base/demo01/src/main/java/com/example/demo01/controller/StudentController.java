package com.example.demo01.controller;

import com.example.demo01.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/listAll")
    public Object listAll(){
        return studentService.listAll(1, 10);
    }

    @GetMapping("/listByName")
    public Object listByName(){
        return studentService.listByName(1, 10);
    }
}
