package com.RESTfulApplication.RestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RESTfulApplication.RestService.entities.Employee;
import com.RESTfulApplication.RestService.services.Employees;

@RestController
public class EmployeeController {
	
	@Autowired
	private Employees employees;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return this.employees.getEmployee();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employees.addEmployee(employee);
	}
}
