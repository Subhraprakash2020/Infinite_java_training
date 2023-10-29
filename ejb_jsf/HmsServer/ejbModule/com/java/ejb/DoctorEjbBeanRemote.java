package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DoctorEjbBeanRemote {
	List<Doctors> showDoctorsDao() throws ClassNotFoundException, SQLException;
	String addPatientDao(Patient patient) throws ClassNotFoundException, SQLException;
	List<Patient> showPatient() throws ClassNotFoundException, SQLException;
	List<String> showRoomType() throws ClassNotFoundException, SQLException;
	List<Room> showRoomNo(String roomType) throws ClassNotFoundException, SQLException;

	
}