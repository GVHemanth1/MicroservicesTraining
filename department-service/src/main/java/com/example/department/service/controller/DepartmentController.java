package com.example.department.service.controller;

import com.example.department.service.entity.Department;
import com.example.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartment(){
        var data = departmentService.getAllDepartment();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getdepartmentById(@PathVariable("id") int id){
        var data = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(data,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        var data = departmentService.saveDepartment(department);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

}
