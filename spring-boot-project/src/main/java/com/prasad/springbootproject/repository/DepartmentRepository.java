package com.prasad.springbootproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.prasad.springbootproject.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    
    @Query(value = "select * from department  where department_name=?1",nativeQuery = true)
	 public List<Department> getByName(String departmentName);
	 
	
	@Query(value = "select * from department where department_name=?1 and department_address=?2",nativeQuery = true)
	public List<Department> getByAddressAndName(String departmentName, String departmentAddress );
    
    
  
}