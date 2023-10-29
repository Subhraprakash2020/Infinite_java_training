package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter employ no");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter employ name");
		employ.setName(sc.next());
		System.out.println("Enter employ gender");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter dept");
		employ.setDept(sc.next());
		System.out.println("Ente employ desig ");
		employ.setDesig(sc.next());
		System.out.println("Ente employ basic");
		employ.setBasic(sc.nextDouble());
		EmployDAO dao = new EmployDAOImpl();
		try {
			System.out.println(dao.updateEmployDao(employ));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
