package com.ve3yn4uk.springboot.restcrudapihibernate.service;

import com.ve3yn4uk.springboot.restcrudapihibernate.dao.IEmployeeDao;
import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

@Service
public class EmployeeServiceDAOImpl implements IEmployeeService {

    private IEmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceDAOImpl(@Qualifier("employeeDAOJpaImpl") IEmployeeDao myEmployeeDao) {
        employeeDao = myEmployeeDao;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        return employeeDao.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDao.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDao.deleteById(theId);
    }
}
