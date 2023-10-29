package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		int empno;
		double basic;
		String name, gender, dept, desig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employ no:");
		empno = sc.nextInt();
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter gender ");
		gender = sc.next();
		System.out.println("Enter dept :");
		dept = sc.next();
		System.out.println("Ender desig: ");
		desig = sc.next();
		System.out.println("Enter the basic");
		basic = sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_auguest23","root","subhra");
			String cmd = "update employ set name = ?,gender = ?, dept = ?, desig = ?, basic = ? where empno = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setString(2, gender);
			pst.setString(3, dept);
			pst.setString(4, desig);
			pst.setDouble(5, basic);
			pst.setInt(6, empno);
			pst.executeUpdate();
			System.out.println("Record updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
