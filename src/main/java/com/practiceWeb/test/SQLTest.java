package com.practiceWeb.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.practiceWeb.rds.entity.Person;

public class SQLTest {

	private static SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	
	public static void main(String[] args) {
		Session session = sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for (Person p : personsList) {
			System.out.println(p.getPersonName());
			;
		}
	}

}
