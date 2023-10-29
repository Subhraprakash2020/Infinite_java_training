package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl implements EmployDAO {
	
	SessionFactory sf;
	Session session;

	@Override
	public List<Employ> showEmployDao() {
//		sf = SessionHelper.getConnection();
//		session = sf.openSession();
//		Query query = session.createQuery("from Employ");
//		List<Employ> employList = query.list();
//		return employList;
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.asc("basic"));
		List<Employ> employList = cr.list();
		return employList;
		
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
//		Query query = session.createQuery("from Employ where empno="+empno);
//		List<Employ> employList = query.list();
//		if(employList.size() >0) {
//			return employList.get(0);
//		}
//		return null;
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eqOrIsNull("empno", empno));
		Employ employ = (Employ)cr.uniqueResult();
		return employ;

	}

	@Override
	public String addEmployDao(Employ employ) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Employ Record Insertrd";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if(employFound != null) {
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.delete(employFound);
			trans.commit();
			return "Employ record deleted..";
		}
		return "Employ record not found ...";
		
	}

}