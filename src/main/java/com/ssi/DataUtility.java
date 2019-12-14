package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataUtility {

	public static SessionFactory factory;

	private DataUtility() {
	}

	public static synchronized SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}

}
