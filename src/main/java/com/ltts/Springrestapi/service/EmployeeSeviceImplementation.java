package com.ltts.Springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ltts.Springrestapi.model.Employee;
import com.ltts.Springrestapi.repository.EmployeeRepository;

@Service
public class EmployeeSeviceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;
	
	@Override
	public List<Employee> getEmployees(){
		return eRepository.findAll();
		
	}

	@Override
	public Employee saveEmployees(Employee employee) {
		return eRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = eRepository.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new RuntimeException("Ëmployee not found with id "+id);
		}
		
	}

	@Override
	public void deleteEmployee(Long id) {
		eRepository.deleteById(id); 
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return eRepository.save(employee);
	}
}
