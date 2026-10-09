package com.example.zadanie2.dao;

import com.example.zadanie2.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
