package com.zf.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSystemFactory("");
	private static SessionFactory buildSystemFactory(String system) {
		try {
			return new Configuration().configure("com/zf/test/hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSession() {
		sessionFactory.close();
	}
}
