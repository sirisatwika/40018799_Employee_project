package com.ltts.Springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.Springrestapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
