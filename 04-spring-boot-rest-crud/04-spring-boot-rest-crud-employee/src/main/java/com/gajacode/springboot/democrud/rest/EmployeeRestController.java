package com.gajacode.springboot.democrud.rest;

import com.gajacode.springboot.democrud.dao.EmployeeDAO;
import com.gajacode.springboot.democrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO theemployeeDAO;

    // constructor inject the dao
    @Autowired
    public EmployeeRestController(EmployeeDAO theemployeeDAO) {
        this.theemployeeDAO = theemployeeDAO;
    }


    // setup the endpoint for the finaAll method of the DAO
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return theemployeeDAO.getAll();
    }
}
