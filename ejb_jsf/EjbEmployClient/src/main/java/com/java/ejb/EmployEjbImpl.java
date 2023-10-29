package com.java.ejb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class EmployEjbImpl {
	public List<Employ> showEmployEjb() throws ClassNotFoundException, SQLException, NamingException{
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showEmploy();
	}
	
	public String searchEmployEjb(int empno) throws ClassNotFoundException, SQLException, NamingException {
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		Employ employ = remote.searchEmploy(empno);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("editEmploy", employ);
		return "UpdateEmploy.jsp?faces-redrict=true";
	}
	
	public String addEmploy(Employ employ) throws NamingException, ClassNotFoundException, SQLException {
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		remote.addEmploy(employ);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException, NamingException {
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		remote.deleteEmploy(empno);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	
	public String updateEmploy(Employ employ) throws NamingException, ClassNotFoundException, SQLException {
		EmployEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		remote.updateEmploy(employ);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}
	
}
