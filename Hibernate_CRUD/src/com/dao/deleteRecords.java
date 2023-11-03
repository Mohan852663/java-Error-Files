package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.Employee;

public class deleteRecords {
	public static void main(String []args)
	{
		//configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//sessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		//session
		Session session = factory.openSession();
		//transaction 
		Transaction tx = session.beginTransaction();
		
		Employee emp = session.get(Employee.class,101);
		session.delete(emp);
		tx.commit();
		session.close();
		
		
	}
}
