package com.gajacode.springboot.democrud.rest;

import com.gajacode.springboot.democrud.entity.Employee;
import com.gajacode.springboot.democrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // constructor inject the service

    private JsonMapper theJSONMapper;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService,JsonMapper theJSONMapper) {
        this.employeeService = employeeService;
        this.theJSONMapper=theJSONMapper;
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

    // add put mapping - for updating the existing data
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        return this.employeeService.save(theEmployee);

    }

    @PatchMapping("/employees/{employeeid}")
    public Employee patchEmployee(@PathVariable int employeeid, @RequestBody Map<String,Object> thePayload){
        Employee tempEmployee=employeeService.findById(employeeid);

        if(tempEmployee==null){
            throw  new RuntimeException("Employee is not found. Id- "+employeeid);
        }

        if(thePayload.containsKey("id")){
            throw new RuntimeException("Employee with ID are not to be given "+employeeid);
        }

        Employee newEmployee=theJSONMapper.updateValue(tempEmployee,thePayload);
        return employeeService.save(newEmployee);
    }

    // add the deleteMapping to delete the employee by id
    @DeleteMapping("/employees/{employeeid}")
    public String deleteEmployee(@PathVariable int employeeid){
        Employee tempEmployee= employeeService.findById(employeeid);
        if(tempEmployee==null){
            throw new RuntimeException("Employee Id is not found");
        }
        employeeService.deleteByID(employeeid);

        return "Employee with "+employeeid+" is deleted.";
    }

}
