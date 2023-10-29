package com.java.cms;

import java.util.Map;
import java.util.*;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CustomerDAOImpl {
	SessionFactory sf;
	Session session;
	
	public String signInDao(Customer customer) {
		String encr = EncryptPassword.getCode(customer.getCusPassword());
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		
		cr.add(Restrictions.eq("cusUsername",customer.getCusUsername()));
		cr.setProjection(Projections.rowCount());
		long usernameCount = (Long) cr.uniqueResult();
		if(usernameCount >0) {
			System.out.println("Exit");
			return "UserName is already exit";
		}
		customer.setCusPassword(encr.trim());
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		
		String subject = "Welcome to My app";
		String messageText = "Hello,\n\nThank you for signing up for YourApp. Your account has been successfully created.";
		MailSend.mailSend(customer.getCusEmail(), subject, messageText);
		
		return "LoginCustomer.jsp?faces-redirect=true";
	}
	
	
	public String searchCustomerDetailsDao() {
		 Map<String, Object> sessionMap =
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	 String customerLoggined = (String)sessionMap.get("loggedCustomer");
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("cusUsername", customerLoggined));
		Customer customerData = (Customer) criteria.uniqueResult();
		sessionMap.put("customerFound", customerData);
		sessionMap.put("customerId", customerData.getCusId());
		return "CustomerInfo.jsp?faces-redirect=true";

	}
	
	
	public String validateMe(Customer customer) {
		String encr = EncryptPassword.getCode(customer.getCusPassword());
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		cr.add(Restrictions.eq("cusUsername",customer.getCusUsername()));
		cr.add(Restrictions.eq("cusPassword",encr.trim()));
		cr.setProjection(Projections.rowCount());
		long count = (Long)cr.uniqueResult();
		System.out.println("Count"+count);
		if(count == 1) {
			sessionMap.put("loggedCustomer",  customer.getCusUsername());
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			cr = session.createCriteria(Customer.class);
			cr.add(Restrictions.eqOrIsNull("cusUsername", customer.getCusUsername()));
			Customer customerFound = (Customer) cr.uniqueResult();
			sessionMap.put("customerId", customerFound.getCusId());
			return "DashBoard.jsp?faces-redirect=true";
		}
		else {
			sessionMap.put("errorMessage", "Invalid Credential");
			return "ShowMenu.jsp?faces-redirect=true";
		}
	}
	
	public String showCustomerWalletDao() {
		System.out.println("Hi");
		 Map<String, Object> sessionMap =
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		 int custId = (Integer)sessionMap.get("customerId");
		 System.out.println("customerid"+custId);
		 Criteria criteria = session.createCriteria(Wallet.class);
		 criteria.add(Restrictions.eq("custId", custId));
		 List<Wallet> walletList = criteria.list();
		 System.out.println("TOtal Records Retrieved " +walletList.size());
		 sessionMap.put("walletList", walletList);
		 return "CustomerWalletShow.jsp?faces-redirect=true";
	}

}
