package com.java.cms;

import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.List;

import org.hibernate.SessionFactory;

public class RestaurantDAOImpl {
	SessionFactory sf;
	Session session;
	
	public List<Restaurant> showRestaurantDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		return cr.list();
	}
}
