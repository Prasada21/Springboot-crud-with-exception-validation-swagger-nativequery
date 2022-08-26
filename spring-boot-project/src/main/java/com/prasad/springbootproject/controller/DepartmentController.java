package com.prasad.springbootproject.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.springbootproject.entity.Department;
import com.prasad.springbootproject.error.DepartmentNotFoundException;
import com.prasad.springbootproject.service.DepartmentService;



@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
       
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public List<Department> getByName(@PathVariable("name") String departmentName) 
     {
        return departmentService. getByName(departmentName);
    }
    @GetMapping("/departments/nameandaddress/{name}/{address}")
    public List<Department> getByNameAndAddress(@PathVariable("name") String departmentName,@PathVariable("address") String departmentAddress) 
    		throws DepartmentNotFoundException {
        return departmentService. getByName(departmentName);
    }
    
    
    
    
    
    
    
    
    
}