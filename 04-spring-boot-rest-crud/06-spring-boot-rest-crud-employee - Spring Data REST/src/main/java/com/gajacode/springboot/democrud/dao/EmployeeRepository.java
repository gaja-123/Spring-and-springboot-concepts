package com.gajacode.springboot.democrud.dao;

import com.gajacode.springboot.democrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
