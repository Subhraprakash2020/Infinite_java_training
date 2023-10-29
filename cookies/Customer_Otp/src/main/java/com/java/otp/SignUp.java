package com.java.otp;

import java.sql.Date;

public class SignUp {
	private int cust_id;
	private String customer_firstname;
	private String customer_lastname;
	private String customer_username;
	private String customer_password;
	private String customer_email;
	private String customer_phone;
	private String customer_status;
	private Date customer_activation;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustomer_firstname() {
		return customer_firstname;
	}
	public void setCustomer_firstname(String customer_firstname) {
		this.customer_firstname = customer_firstname;
	}
	public String getCustomer_lastname() {
		return customer_lastname;
	}
	public void setCustomer_lastname(String customer_lastname) {
		this.customer_lastname = customer_lastname;
	}
	public String getCustomer_username() {
		return customer_username;
	}
	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_status() {
		return customer_status;
	}
	public void setCustomer_status(String customer_status) {
		this.customer_status = customer_status;
	}
	public Date getCustomer_activation() {
		return customer_activation;
	}
	public void setCustomer_activation(Date customer_activation) {
		this.customer_activation = customer_activation;
	}
	@Override
	public String toString() {
		return "SignUp [cust_id=" + cust_id + ", customer_firstname=" + customer_firstname + ", customer_lastname="
				+ customer_lastname + ", customer_username=" + customer_username + ", customer_password="
				+ customer_password + ", customer_email=" + customer_email + ", customer_phone=" + customer_phone
				+ ", customer_status=" + customer_status + ", customer_activation=" + customer_activation + "]";
	}
	public SignUp(int cust_id, String customer_firstname, String customer_lastname, String customer_username,
			String customer_password, String customer_email, String customer_phone, String customer_status,
			Date customer_activation) {
		super();
		this.cust_id = cust_id;
		this.customer_firstname = customer_firstname;
		this.customer_lastname = customer_lastname;
		this.customer_username = customer_username;
		this.customer_password = customer_password;
		this.customer_email = customer_email;
		this.customer_phone = customer_phone;
		this.customer_status = customer_status;
		this.customer_activation = customer_activation;
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
