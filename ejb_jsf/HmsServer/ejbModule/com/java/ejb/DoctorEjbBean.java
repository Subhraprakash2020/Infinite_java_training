package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class DoctorEjbBean
 */
@Stateless
@Remote(DoctorEjbBeanRemote.class)
public class DoctorEjbBean implements DoctorEjbBeanRemote {

    /**
     * Default constructor. 
     */
	
	static DoctorsDAO daoImpl;
	static PatientDAO daoImpl2;
	static RoomDAO daoImpl3;
	
	static {
		daoImpl = new DoctorsDaoImpl();
		daoImpl2 = new PatientDaoImpl();
		daoImpl3 = new RoomDaoImpl();
	}
	
    public DoctorEjbBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Doctors> showDoctorsDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.showDoctorsDao();
	}

	@Override
	public String addPatientDao(Patient patient) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl2.addPatatientDao(patient);
	}

	@Override
	public List<Patient> showPatient() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl2.showPatient();
	}

	@Override
	public List<String> showRoomType() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl3.showRoomType();
	}

	@Override
	public List<Room> showRoomNo(String roomType) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl3.showRoomNo(roomType);
	}

	


}
