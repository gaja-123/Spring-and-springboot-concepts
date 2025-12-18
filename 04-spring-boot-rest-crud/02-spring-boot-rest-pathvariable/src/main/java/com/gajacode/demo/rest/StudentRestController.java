package com.gajacode.demo.rest;


import com.gajacode.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the students only ones while the bean of StudentRestController is created.
    @PostConstruct
    public void initStudents(){
        theStudents=new ArrayList<>();

        theStudents.add(new Student("f1","l1"));
        theStudents.add(new Student("f2","l2"));
        theStudents.add(new Student("f3","l3"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){

        return theStudents;
    }

    @GetMapping("/student/{studentId}")
    public Student getTheStudent(@PathVariable int studentId){
        return theStudents.get(studentId);
    }
}
