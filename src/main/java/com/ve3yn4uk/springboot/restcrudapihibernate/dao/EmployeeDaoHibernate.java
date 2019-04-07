package com.ve3yn4uk.springboot.restcrudapihibernate.dao;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

@Repository
public class EmployeeDaoHibernate implements IEmployeeDao {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoHibernate(EntityManager myEntityManager) {
        entityManager = myEntityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> myQuery = currentSession.createQuery("from employee", Employee.class);

        List<Employee> employees = myQuery.getResultList();

        return employees;
    }


}
