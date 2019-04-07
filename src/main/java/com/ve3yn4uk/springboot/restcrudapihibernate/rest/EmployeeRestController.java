package com.ve3yn4uk.springboot.restcrudapihibernate.rest;

import com.ve3yn4uk.springboot.restcrudapihibernate.dao.IEmployeeDao;
import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IEmployeeDao employeeDao;

    @Autowired
    private EmployeeRestController(IEmployeeDao myEmployeeDao) {
        employeeDao = myEmployeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {

        return employeeDao.findAll();
    }
}
