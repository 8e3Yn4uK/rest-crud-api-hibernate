package com.ve3yn4uk.springboot.restcrudapihibernate.service;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);


}
