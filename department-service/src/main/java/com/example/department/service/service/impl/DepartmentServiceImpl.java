package com.example.department.service.service.impl;

import com.example.department.service.entity.Department;
import com.example.department.service.repository.DepartmentRepository;
import com.example.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }


    @Override
    public Department getDepartmentById(int id){
        return departmentRepository.findById(id).get();
    }

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
}
