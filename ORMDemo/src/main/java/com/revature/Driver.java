package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		//create a session
		Session s = sf.getCurrentSession();
		System.out.println(s.getStatistics());
		s.close();
	}

}
