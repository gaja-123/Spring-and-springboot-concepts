package com.gajacode.springboot.democrud.dao;

import com.gajacode.springboot.democrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAll();
}
