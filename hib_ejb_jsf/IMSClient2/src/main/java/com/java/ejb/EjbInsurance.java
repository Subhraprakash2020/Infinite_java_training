package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import com.java.jsf.Employ;
//import com.java.jsf.SessionHelper;

//import com.java.jsf.Employ;
//import com.java.jsf.SessionHelper;

public class EjbInsurance {
	public List<Insurance> showEjbInsurance() throws NamingException{
		InsuranceBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showInsurance();
	}
	
	public List<Insurance> showInsuranceDao() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Insurance.class);
		return cr.list();
	}
	
	public List<Insurance> showEmployDao(int firstRow, int rowCount) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Insurance.class);
		cr.setFirstResult(firstRow);
		cr.setMaxResults(rowCount);
		System.out.println(firstRow);
		System.out.println(rowCount);
		System.out.println(cr.list());
		return cr.list();
	}
	public List<Insurance> getListOfEmploy(int firstRow, int rowCount) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		List<Insurance> cdList = null;
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Insurance.class);
			criteria.setFirstResult(firstRow);
			criteria.setMaxResults(rowCount);
		return criteria.list();
	}
	
	public int countRows() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Insurance.class);
			if (criteria != null) {
				return criteria.list().size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
