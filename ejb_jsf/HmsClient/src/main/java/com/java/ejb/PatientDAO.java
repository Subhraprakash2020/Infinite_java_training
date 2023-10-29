package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
	String addPatatientDao(Patient patient) throws ClassNotFoundException, SQLException;
	String redirectPatient(Patient patient) throws ClassNotFoundException, SQLException;
	List<Patient> showPatient() throws ClassNotFoundException, SQLException;
}
