package com.java.bank;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ number :");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAOImpl();
		
		try {
			
			Optional<Employ> employ = Optional.ofNullable(dao.searchEmployDao(empno));
			if(employ.isPresent()) {
				System.out.println(employ);
			}
			else {
				System.out.println("Employ record not found");
			}
//			Employ employ = dao.searchEmployDao(empno);
//			if(employ != null) {
//				System.out.println(employ);
//			}
//			else {
//				System.out.println("Record not found");
//			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
