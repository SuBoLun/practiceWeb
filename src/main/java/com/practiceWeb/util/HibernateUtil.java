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
//		session.beginTransaction(); // 開啟交易
//		session.save(person); // 儲存 Dvd 實體
//		session.getTransaction().commit(); // 確認變更
//		session.close(); // 關閉此次操作過程
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
