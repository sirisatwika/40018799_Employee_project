package com.ltts.Springrestapi.service;

import java.util.List;

import com.ltts.Springrestapi.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
		
	Employee saveEmployees(Employee employee);
	
	Employee getEmployeeById(Long Id);
	
	void deleteEmployee(Long id);
	
	Employee updateEmployee(Employee employee);
}
