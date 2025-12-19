package com.gajacode.springboot.democrud.rest;

import com.gajacode.springboot.democrud.dao.EmployeeDAO;
import com.gajacode.springboot.democrud.entity.Employee;
import com.gajacode.springboot.democrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // constructor inject the service


    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // setup the endpoint for the finaAll method of the DAO
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.findALL();
    }
}
