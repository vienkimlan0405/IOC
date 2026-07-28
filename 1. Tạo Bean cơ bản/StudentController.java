package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private Student student;

    @GetMapping("/student")
    public String printStudent() {
        System.out.println(student.getInfo());
        return student.getInfo();
    }
}
