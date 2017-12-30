package com.java2blog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java2blog.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public List<Employee> getEmployees(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> empList = session.createQuery(" from Employee").list();
		return empList;		
	}
	
	public Employee getEmployeeById(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee)session.get(Employee.class, new Integer(id));
		return employee;
	}
	
	public Employee addEmplyee(Employee employee){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(employee);
		return employee;
	}
	
	public void updateEmplyee(Employee employee){
		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
	}
	
	public void deleteEmplyee(int id){
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee)session.get(Employee.class, new Integer(id));
		if(null != employee){
			session.delete(employee);
		}
	}
}
