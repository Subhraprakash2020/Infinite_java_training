package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter empno");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAOImpl();
		
		try {
			System.out.println(dao.deleteEmployDao(empno));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
