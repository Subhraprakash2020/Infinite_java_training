package com.java.ejb;

import java.sql.SQLException;

public class RoomTypeTest {
	public static void main(String[] args) {
		RoomDaoImpl impl = new RoomDaoImpl();
		try {
			System.out.println(impl.showRoomType());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
