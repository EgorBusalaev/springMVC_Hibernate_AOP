package com.egor.spring.mvc_hibernate.service;

import com.egor.spring.mvc_hibernate.dao.EmployeeDAO;
import com.egor.spring.mvc_hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class EmployeeServiceImplement implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}