package com.gajacode.springboot.democrud.service;

import com.gajacode.springboot.democrud.dao.EmployeeDAO;
import com.gajacode.springboot.democrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{


    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findALL() {
        return employeeDAO.getAll();
    }
}
