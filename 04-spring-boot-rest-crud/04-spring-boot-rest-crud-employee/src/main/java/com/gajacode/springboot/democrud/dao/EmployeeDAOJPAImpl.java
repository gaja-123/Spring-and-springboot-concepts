package com.gajacode.springboot.democrud.dao;

import com.gajacode.springboot.democrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements  EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> getAll() {
       // query db
        TypedQuery<Employee> query=entityManager.createQuery("from Employee",Employee.class);
        // get employees as a list

        List<Employee> employees=query.getResultList();
        // return the list
        return employees;
    }
}
