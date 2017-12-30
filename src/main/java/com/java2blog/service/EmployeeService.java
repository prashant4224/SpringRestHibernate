package com.java2blog.service;

import java.util.List;

import com.java2blog.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(int id);
	
	public void addEmplyee(Employee employee);
	
	public void updateEmplyee(Employee employee);
	
	public void deleteEmplyee(int id);
}
