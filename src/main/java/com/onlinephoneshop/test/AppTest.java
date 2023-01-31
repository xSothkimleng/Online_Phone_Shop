package com.onlinephoneshop.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onlinephoneshop.entity.Users;

public class AppTest {
	public static void main(String[] args) {
		// create config
		// config => create session factory
		// => open session
		
		//Configurationn config = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = new Configuration()
				.addAnnotatedClass(Users.class)
				.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		Users user = new Users("kim@gmail.com","123","Kimleng");
		
		session.persist(user);
		session.getTransaction().commit();
		
		
		System.out.println("Hello World");
	}
}
