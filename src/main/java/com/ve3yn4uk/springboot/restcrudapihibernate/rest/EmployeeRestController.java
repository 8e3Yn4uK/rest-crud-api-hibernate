package com.ve3yn4uk.springboot.restcrudapihibernate.rest;

import com.ve3yn4uk.springboot.restcrudapihibernate.dao.IEmployeeDao;
import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import com.ve3yn4uk.springboot.restcrudapihibernate.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 07.04.2019
 */

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IEmployeeService employeeService;

    @Autowired
    private EmployeeRestController(IEmployeeService myEmployeeService) {

        employeeService = myEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {

        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        Employee myEmployee = employeeService.findById(employeeId);

        if (myEmployee == null) {
            throw new RuntimeException("Employee id not found " + employeeId);
        }

        return myEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theImployee) {

        theImployee.setId(0);
        employeeService.save(theImployee);

        return theImployee;
    }


}
