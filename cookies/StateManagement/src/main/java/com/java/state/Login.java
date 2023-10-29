package com.java.state;

public class Login {
	private String userName;
	private String passcode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", passcode=" + passcode + "]";
	}
	public Login(String userName, String passcode) {
		super();
		this.userName = userName;
		this.passcode = passcode;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
