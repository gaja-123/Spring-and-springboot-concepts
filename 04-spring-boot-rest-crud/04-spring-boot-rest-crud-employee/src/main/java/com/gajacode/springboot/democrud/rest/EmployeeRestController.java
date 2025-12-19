package com.gajacode.springboot.democrud.rest;

import com.gajacode.springboot.democrud.dao.EmployeeDAO;
import com.gajacode.springboot.democrud.entity.Employee;
import com.gajacode.springboot.democrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // get the single employee by id
    @GetMapping("/employees/{employeeId}")
    public Employee getById(@PathVariable int employeeId){
        Employee theEmployee= this.employeeService.findById(employeeId);
        if(theEmployee == null){
            throw new RuntimeException("This id is not found - "+employeeId);
        }
        return theEmployee;
    }

    // post mapping to add a new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        // to only add new employee
        theEmployee.setId(0);

        return this.employeeService.save(theEmployee);
    }
}
