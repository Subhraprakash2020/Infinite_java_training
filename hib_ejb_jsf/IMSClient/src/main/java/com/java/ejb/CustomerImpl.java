package com.java.ejb;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerImpl {
	SessionFactory sf;
	Session session;
	
	public static int generateOtp() {
		Random r = new Random(System.currentTimeMillis());
		return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}
	
	public String createAccount(Customer customer) {
//		    try {
//		        sf = SessionHelper.getConnection(); 
//				session = sf.openSession();
//		        Transaction transaction = session.beginTransaction();
//		        session.save(customer); // Save the Employ entity
//		        transaction.commit();
//		        return "Employ Record Inserted...";
//		    } catch (Exception e) {
//		        e.printStackTrace();
//		        return "An error occurred.";
//		    } finally {
//		        if (session != null) {
//		            session.close();
//		        }
//		    }
		sf = SessionHelper.getConnection();

		session = sf.openSession();

		Transaction trans = session.beginTransaction();

		

		session.save(customer);

		session.getTransaction().commit();

 

		

		int otp= generateOtp();
		
		String subject = "Welcome to Life Insurance ";

		String messageText = "Hello,\n\nThank you for signing up in our LicApp. Your otp is "+otp+"It is "

				+ "valid for 10 minuetes only dont share your  otp with others";

		MailSend.mailSend(customer.getEmail(), subject, messageText);
		return"CustomerLogin.jsp?faces-redirect=true";
	}
	
	
}
