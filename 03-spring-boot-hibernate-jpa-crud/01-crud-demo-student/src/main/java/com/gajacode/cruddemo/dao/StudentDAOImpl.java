package com.gajacode.cruddemo.dao;

import com.gajacode.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{


    // filed for enity manager( is Main JPA component that helps to save and retire the object from DB)
    private EntityManager entityManager;
    // inject the entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    // define save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }

    @Override
    public Student getById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> q=entityManager.createQuery("select s from Student s",Student.class);
        return q.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> q=entityManager.createQuery("select s from Student s where lastName=:theData",Student.class);
        q.setParameter("theData",lastName);
        return q.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        Student s=entityManager.find(Student.class,id);
        entityManager.remove(s);
    }

    @Override
    @Transactional
    public void deleteStudent(String lastname) {
        Query q=entityManager.createQuery("Delete  from Student s where lastName=:lname");
        q.setParameter("lname",lastname);
        int deletedRows=q.executeUpdate();
    }

}
