package com.ve3yn4uk.springboot.restcrudapihibernate.dao;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 08.04.2019
 */

@Repository
public class EmployeeDAOJpaImpl implements IEmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        Query theQuery = entityManager.createQuery("from Employee");

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public void save(Employee theEmployee) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
