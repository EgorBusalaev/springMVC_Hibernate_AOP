package com.egor.spring.mvc_hibernate.controller;

import com.egor.spring.mvc_hibernate.dao.EmployeeDAO;
import com.egor.spring.mvc_hibernate.entity.Employee;
import com.egor.spring.mvc_hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
      List<Employee> allEmployees = employeeService.getAllEmployees();
      model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
