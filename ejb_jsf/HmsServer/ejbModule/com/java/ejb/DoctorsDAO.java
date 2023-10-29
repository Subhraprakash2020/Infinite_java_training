package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface DoctorsDAO {
	List<Doctors> showDoctorsDao() throws SQLException, ClassNotFoundException;

}
