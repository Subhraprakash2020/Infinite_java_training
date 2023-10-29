package com.java.bank;

import java.sql.SQLException;
import java.util.List;

public class EmployShowMain {
	public static void main(String[] args) {
		EmployDAO  dao = new EmployDAOImpl();
		
		List<Employ> employList;
		try {
			employList = dao.showEmployDao();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
