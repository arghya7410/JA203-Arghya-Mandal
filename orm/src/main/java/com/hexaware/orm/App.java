package com.hexaware.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.orm.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction tr = session.beginTransaction();
    	Employee emp = new Employee(101, "Arghya", 90000);
    	session.saveOrUpdate(emp);
    	Employee emp1 = new Employee(102, "Javeed", 50000);
    	session.saveOrUpdate(emp1);
    	
    	tr.commit();
    	Employee e1 = session.get(Employee.class, 101);
    	System.out.println(e1);
    	
    }
}
