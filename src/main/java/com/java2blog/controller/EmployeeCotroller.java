package com.java2blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java2blog.entity.Employee;
import com.java2blog.service.EmployeeService;

@RestController
public class EmployeeCotroller {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, headers="Accept=application/json")
	public List<Employee> getEmployees(){
		List<Employee> empList = employeeService.getEmployees();
		return empList;
	}
	
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, headers="Accept=application/json")
	public Employee getEmployeeById(@PathVariable int id){
		return employeeService.getEmployeeById(id);
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, headers="Accept=application/json")
	public void addEmployee(@RequestBody Employee employee){
		employeeService.addEmplyee(employee);
	}
	
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT, headers="Accept=application/json")
	public void updateEmployee(@RequestBody Employee employee){
		employeeService.updateEmplyee(employee);
	}
	
	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE, headers="Accept=application/json")
	public void addEmployee(@PathVariable int id){
		employeeService.deleteEmplyee(id);
	}
}
