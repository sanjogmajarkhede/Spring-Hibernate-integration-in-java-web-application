package com.example.springhibernaterealproject.service.impl;

import com.example.springhibernaterealproject.entities.EmployeeEntity;
import com.example.springhibernaterealproject.services.EmployeeService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    private Configuration configuration=new Configuration().configure().addAnnotatedClass(EmployeeEntity.class);
    private SessionFactory sessionFactory=configuration.buildSessionFactory();
    private Session session=sessionFactory.openSession();
    private Transaction transaction=session.beginTransaction();

    public void addEmployee(EmployeeEntity employee) {

    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> lst=new ArrayList<>();
        return lst;
    }

    @Override
    public EmployeeEntity getEmployeeById(int empId) {
        return null;
    }

    @Override
    public void updateEmployeeDetails(int empId) {

    }

    @Override
    public void deleteEmployeById(int empId) {

    }
}
