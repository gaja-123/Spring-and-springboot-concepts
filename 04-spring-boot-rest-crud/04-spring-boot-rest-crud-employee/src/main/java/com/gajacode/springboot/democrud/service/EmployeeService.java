package com.gajacode.springboot.democrud.service;

import com.gajacode.springboot.democrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findALL();
}
