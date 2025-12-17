package com.gajacode.cruddemo.dao;

import com.gajacode.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student theStudent);

    public Student getById(int id);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastName);

    public void updateStudent(Student theStudent);

    public void deleteStudent(int id);

    public void deleteStudent(String lastname);
}
