package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter employ no ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter employ name ");
		employ.setName(sc.next());
		System.out.println("Enter gender (MALE/FEMALE)");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation");
		employ.setDesig(sc.next());
		System.out.println("Enter basic ");
		employ.setBasic(sc.nextDouble());
		
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		session.update(employ);
		transaction.commit();
		System.out.println("**** Record Updated *****");
	}
}
