package com.example.springhibernaterealproject.controllers;

import com.example.springhibernaterealproject.entities.EmployeeEntity;
import com.example.springhibernaterealproject.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeManagementController {
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping("/emp")
    public String manageEmployee(){
        EmployeeEntity employeeEntity=new EmployeeEntity();
        employeeEntity.setId(1222);
        employeeEntity.setName("Avinash");
        employeeEntity.setPosition("ATC");
        employeeServiceImpl.addEmployee(employeeEntity);
        return "Employee Added!";
    }
}
