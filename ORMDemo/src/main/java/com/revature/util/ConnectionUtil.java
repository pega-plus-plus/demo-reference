package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	
	private ConnectionUtil() {
		super();
	}
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			//if no SessionFactory has been created, create one
			Configuration c = new Configuration();
			c.setProperty("hibernate.connection.username", System.getenv("BEARS_DB_USERNAME"));
			c.setProperty("hibernate.connection.password", System.getenv("BEARS_DB_PASS"));
			c.setProperty("hibernate.connection.url", System.getenv("BEARS_DB_URL"));
			c.configure(); //by default, looking for hibenate.cfg.xml in src/main/resources
			sessionFactory = c.buildSessionFactory();
		}
		return sessionFactory;
	}

}
