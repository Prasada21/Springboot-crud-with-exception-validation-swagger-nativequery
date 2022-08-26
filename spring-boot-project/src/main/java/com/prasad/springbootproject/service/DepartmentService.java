package com.prasad.springbootproject.service;

import java.util.List;


import com.prasad.springbootproject.entity.Department;
import com.prasad.springbootproject.error.DepartmentNotFoundException;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
    
    public List<Department> getByName(String departmentName);
    
    public List<Department> getByNameAndAddress(String departmentName, String departmentAddress );
  
    
}