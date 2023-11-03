package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class updateRecord {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = session.get(Employee.class,101);
		emp.setEmpname("Ramesh");
		emp.setSalary(40000);
		emp.setJob("developer");
		
		session.update(emp);
		tx.commit();
		session.close();
	}

}
