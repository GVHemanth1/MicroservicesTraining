package com.thevarugupta.department.service.service;

import com.thevarugupta.department.service.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartment();
    Department getDepartmentById(int id);
    Department saveDepartment(Department department);
}
