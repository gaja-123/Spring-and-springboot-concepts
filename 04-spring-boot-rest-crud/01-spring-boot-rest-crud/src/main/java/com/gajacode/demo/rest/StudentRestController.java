package com.gajacode.demo.rest;


import com.gajacode.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> theStudents=new ArrayList<>();

        theStudents.add(new Student("f1","l1"));
        theStudents.add(new Student("f2","l2"));
        theStudents.add(new Student("f3","l3"));

        return theStudents;
    }
}
