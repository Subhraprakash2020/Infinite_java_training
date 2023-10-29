package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

public class DoctorsEjbImpl {
	public List<Doctors> shoeDoctorsEjb() throws ClassNotFoundException, SQLException, NamingException{
		DoctorEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showDoctorsDao();
	}
}
