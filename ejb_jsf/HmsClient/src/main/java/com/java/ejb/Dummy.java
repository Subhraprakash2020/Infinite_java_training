package com.java.ejb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Dummy {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		
		//SessionFactory sf = SessionHelper.getConnection();
		//System.out.println(sf);
	}
}
