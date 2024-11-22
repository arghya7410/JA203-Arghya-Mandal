package com.hexaware.springrest.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    IEmployeeService service; // Dependency Injection [3 Types: Setter Method, Constructor, Interface]

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp) {

        return service.addEmployee(emp);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp) {

        return service.updateEmployee(emp);
    }

    @DeleteMapping("/delete/{eid}")
    public String delete(@PathVariable  int eid) {

        service.deleteEmployeeById(eid);

        return "Employee: "+eid+" Deleted: ";
    }

    @GetMapping("/getbyid/{eid}")
    public Employee getEmployeeById(@PathVariable int eid) {

        return service.getEmployeeById(eid);
    }

    @GetMapping("/getall")
    public List<Employee> getAll(){

        return service.getAllEmployees();
    }
    
    @GetMapping("/getbyname/{ename}")
    public List<Employee> getByEname(@PathVariable String ename){

        return service.getByEname(ename);
    }
    
    @GetMapping("/getbysalary/{salary}")
    public List<Employee> getBySalary(@PathVariable Double salary){

        return service.getBySalary(salary);
    }
    
    @GetMapping("/getbysalarysorted")
    public List<Employee> getBySalarySorted(){

       return service.getBySalarySorted();
        
    }
}