package com.hexaware.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.orm.entity.Employee;

public class HibernateSelectQueries {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	String selectQuery = "select e.salary from Employee e where e.ename = ?1";
    	Query<Double> query = session.createQuery(selectQuery, Double.class);
        query.setParameter(1, "Javeed");
        Double salary = query.getSingleResult();
        System.out.println("Salary: " + salary);
        String selectQuery1 = "select e from Employee e where e.ename = ?2";
        Query<Employee> query1 = session.createQuery(selectQuery1);
        query1.setParameter(2, "Javeed");
        Employee e1 = query1.getSingleResult();
        System.out.println(e1);
        
        String selectAll = "select e from Employee e";
        Query<Employee> query2 = session.createQuery(selectAll);

        List<Employee> list = query2.getResultList();

        list.forEach((emp) -> System.out.println(emp));
        
        String selectSalaryGT = "select e from Employee e where e.salary > :amount";
        Query<Employee> query3 = session.createQuery(selectSalaryGT);

        query3.setParameter("amount", 45000.0);
        List<Employee> listEmp = query3.getResultList();

        for (Employee employee : listEmp) {

        System.out.println(employee);
        session.close();
        sessionFactory.close();

	}

}}
