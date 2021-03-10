//package com.practiceWeb.util;
//
//import org.hibernate.cfg.Configuration;
//
//import com.practiceWeb.rds.entity.Person;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//public class HibernateUtil {
//
//	public static void main(String[] args) {
//		
//		Person person = new Person();
//		person.setPersonGender(0);
//		person.setPersonName("su");
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction(); // �}�ҥ��
//		session.save(person); // �x�s Dvd ����
//		session.getTransaction().commit(); // �T�{�ܧ�
//		session.close(); // ���������ާ@�L�{
//	}
//
//	private static final SessionFactory sessionFactory;
//	private static final StandardServiceRegistry serviceRegistry;
//
//	static {
//		try {
//			Configuration configuration = new Configuration();
//			configuration.configure();
//
//			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//		} catch (Throwable ex) {
//			throw new ExceptionInInitializerError(ex);
//		}
//	}
//
//	public static SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public static void closeAllResources() {
//		sessionFactory.close();
//		StandardServiceRegistryBuilder.destroy(serviceRegistry);
//	}
//}