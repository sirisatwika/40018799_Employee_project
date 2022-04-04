package com.ltts.Springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Springrestapi.model.Employee;
import com.ltts.Springrestapi.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	
	@GetMapping(value="/employees")
	public List<Employee> getEmployees () {
		return eService.getEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) {
		return eService.getEmployeeById(id);
	}
	
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee e) {
		return eService.saveEmployees(e);
	}
	
	@PutMapping("/employees/{id}")
	public Employee update(@RequestBody Employee e, @PathVariable Long id) {
		e.setId(id);
		return eService.updateEmployee(e);
	}
		
	@DeleteMapping("/employees")
	public void deleteEmployee(@RequestParam("id") Long id) {
		eService.deleteEmployee(id);
	}
}
