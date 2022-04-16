package com.createiq.utillconnection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	private static SessionFactory sf=null;
	static {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sf=configuration.buildSessionFactory();
	}
	public static Session getSession() {
		return sf.openSession();
	}
	public static void close(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	

}
