package com.docker.service;

import com.docker.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployee();
}
