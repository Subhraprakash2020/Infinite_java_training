package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DoctorEjbBeanRemote {
	List<Doctors> showDoctorsDao() throws ClassNotFoundException, SQLException;
	String addPatientDao(Patient patient);
	List<Patient> showPatient() throws ClassNotFoundException, SQLException;
	List<Room> showRoomType() throws ClassNotFoundException, SQLException;
	List<Room> showRoomNo(String roomType) throws ClassNotFoundException, SQLException;


}
