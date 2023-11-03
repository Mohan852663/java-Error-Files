package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.model.Employee;

public class insertRecord {

	public static void main(String[] args) throws HibernateException 
	{
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setEmpname("surya");
		emp.setSalary(25000);
		emp.setJob("CEO");
		emp.setDeptno(2501);
		session.save(emp);
		System.out.println("Record Successfully inserted");
		session.close();
	}

}
