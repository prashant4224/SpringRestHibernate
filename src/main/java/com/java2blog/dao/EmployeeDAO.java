package com.java2blog.dao;

import java.util.List;

import com.java2blog.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(int id);
	
	public Employee addEmplyee(Employee employee);
	
	public void updateEmplyee(Employee employee);
	
	public void deleteEmplyee(int id);
}
