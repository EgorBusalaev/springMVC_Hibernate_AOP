package com.egor.spring.mvc_hibernate.service;

import com.egor.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
