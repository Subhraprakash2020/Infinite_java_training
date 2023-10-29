package com.java.cms;

import javax.faces.context.FacesContext;

public class CustomerController {
	private Customer customer;

	private CustomerDAOImpl daoImpl;
	
	public CustomerDAOImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(CustomerDAOImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	public String searchCustomer() { 
		return daoImpl.searchCustomerDetailsDao();
	}
	
			
		
	
}
