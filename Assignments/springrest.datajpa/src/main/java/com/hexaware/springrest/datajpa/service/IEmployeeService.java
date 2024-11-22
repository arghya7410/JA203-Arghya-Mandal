package com.hexaware.springrest.datajpa.service;

import java.util.List;

import com.hexaware.springrest.datajpa.entity.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);
	public Employee getEmployeeById(int eid);
	public void deleteEmployeeById(int eid);
	public List<Employee> getAllEmployees();
	public List<Employee> getByEname(String ename);
	public List<Employee> getBySalary(Double salary);
	public List<Employee> getBySalarySorted();
	
}
