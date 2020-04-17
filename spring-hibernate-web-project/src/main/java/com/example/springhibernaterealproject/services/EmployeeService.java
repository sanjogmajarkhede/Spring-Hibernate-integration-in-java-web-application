package com.example.springhibernaterealproject.services;

import com.example.springhibernaterealproject.entities.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity getEmployeeById(int empId);
    public void updateEmployeeDetails(int empId);
    public void deleteEmployeById(int empId);
}
