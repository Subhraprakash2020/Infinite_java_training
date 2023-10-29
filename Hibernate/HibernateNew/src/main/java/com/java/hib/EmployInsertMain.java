package com.java.hib;

import java.util.Scanner;

public class EmployInsertMain {
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
		
		EmployDAO dao = new EmployDAOImpl();
		System.out.println(dao.addEmployDao(employ));
	}
}
