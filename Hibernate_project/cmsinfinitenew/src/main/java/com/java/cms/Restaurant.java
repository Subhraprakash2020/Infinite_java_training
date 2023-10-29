package com.java.cms;

public class Restaurant {
	private String 	restaurantId;
	private String restaurantName;
	private String branch;
	private String city;
	private String mobileno;
	private String email;
	private double rating;
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", branch=" + branch
				+ ", city=" + city + ", mobileno=" + mobileno + ", email=" + email + ", rating=" + rating + "]";
	}
	public Restaurant(String restaurantId, String restaurantName, String branch, String city, String mobileno,
			String email, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.branch = branch;
		this.city = city;
		this.mobileno = mobileno;
		this.email = email;
		this.rating = rating;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
