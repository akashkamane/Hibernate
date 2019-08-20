package com.simple.maven.HibernateXml;

import java.io.Serializable;

import javax.security.auth.login.Configuration;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManageEmployee {
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		try {
	         sessionFactory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      
	      ManageEmployee ME = new ManageEmployee();

	      Employee e1=new Employee("Akash","Kamane",100000);
	      Integer id1=ME.addEmployee(e1);
	      
	       }
	public Integer addEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		Integer id=null;
		try {
			tx=session.beginTransaction();
			Serializable s=session.save(employee);
			id=(Integer)s;
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			System.out.println(e);
		}
		finally {
			session.close();
		}
		return id;
			
		}
	}
	   
	   
	   
	   
	   
	