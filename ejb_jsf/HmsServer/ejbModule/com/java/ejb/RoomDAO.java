package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface RoomDAO {
	List<String> showRoomType() throws ClassNotFoundException, SQLException;
	List<Room> showRoomNo(String roomType) throws ClassNotFoundException, SQLException;
}
