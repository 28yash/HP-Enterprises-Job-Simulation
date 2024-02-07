package com.RESTfulApplication.RestService.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RESTfulApplication.RestService.entities.Employee;

@Service
public class EmployeeManager implements Employees {
	private List<Employee> list = new ArrayList<>();
	
	public EmployeeManager() {
		list.add(new Employee("101","Yash","Likhitkar","abc@gmail.com","Associate"));
		list.add(new Employee("102","Tanmay","Patel","xyz@gmail.com","SDE"));
		list.add(new Employee("103","Yashi","Rahangdale","pqr@gmail.com","Analyst"));
	}

	@Override
	public List<Employee> getEmployee() {
		return list;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}
}
