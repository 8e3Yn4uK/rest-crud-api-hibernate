package com.ve3yn4uk.springboot.restcrudapihibernate.dao;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 8e3Yn4uK on 08.04.2019
 */

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
