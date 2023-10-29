package com.java.cms;

import java.util.Map;
import java.util.List;


import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


public class MenuDAOImpl {
	SessionFactory sf;
	Session session;
	public String showMenuDao(String restaurantId) {
		Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Menu.class);
		cr.add(Restrictions.eq("restaurantId",restaurantId));
		List<Menu> menuList = cr.list();
		sessionMap.put("menuList",menuList);
		return "ShowMenu.jsp?faces-redirect=true";

	}
}
