package com.RESTfulApplication.RestService.services;

import java.util.List;

import com.RESTfulApplication.RestService.entities.Employee;

public interface Employees {

	public List<Employee> getEmployee();

	public Employee addEmployee(Employee employee);
	
}
