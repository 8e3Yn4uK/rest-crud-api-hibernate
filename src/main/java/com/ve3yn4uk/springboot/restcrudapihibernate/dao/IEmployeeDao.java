package com.ve3yn4uk.springboot.restcrudapihibernate.dao;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

public interface IEmployeeDao {

     List<Employee> findAll();



}
