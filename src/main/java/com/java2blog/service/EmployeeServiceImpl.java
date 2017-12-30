package com.java2blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java2blog.dao.EmployeeDAO;
import com.java2blog.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public List<Employee> getEmployees(){
		return employeeDAO.getEmployees();
	}
	
	@Transactional
	public Employee getEmployeeById(int id){
		return employeeDAO.getEmployeeById(id);
	}
	
	@Transactional
	public void addEmplyee(Employee employee){
		employeeDAO.addEmplyee(employee);
	}
	
	@Transactional
	public void updateEmplyee(Employee employee){
		employeeDAO.updateEmplyee(employee);
	}
	
	@Transactional
	public void deleteEmplyee(int id){
		employeeDAO.deleteEmplyee(id);
	}
}
