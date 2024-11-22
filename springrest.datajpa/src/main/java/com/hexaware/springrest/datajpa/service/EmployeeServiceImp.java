package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;
@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	EmployeeRepository repo;
	@Override
	public Employee addEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		return repo.findById(eid).orElse(null);
	}

	@Override
	public void deleteEmployeeById(int eid) {
		repo.deleteById(eid);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public List<Employee> getByEname(String ename) {
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalary(Double salary) {
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalarySorted() {
		return repo.findAll(Sort.by(Order.desc("salary")));
		//return repo.findAll(Sort.by("salary")); for ascending order sorting since its default.
	}

}
