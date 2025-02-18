package com.example.department.service.service;

import com.example.department.service.entity.Department;

import java.util.List;

public interface DepartmentService {
//    List<Department> getDepartment();

    List<Department> getAllDepartment();

    Department getDepartmentById(int id);
    Department saveDepartment(Department department);
}
