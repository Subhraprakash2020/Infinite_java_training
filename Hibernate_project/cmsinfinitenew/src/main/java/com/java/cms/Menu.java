package com.java.cms;

public class Menu {
	private int menId;
	private String menItem;
	private double menPrice;
	private String restaurantId;
	private double menCalories;
	private String menSpeciality;
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getMenItem() {
		return menItem;
	}
	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}
	public double getMenPrice() {
		return menPrice;
	}
	public void setMenPrice(double menPrice) {
		this.menPrice = menPrice;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getMenCalories() {
		return menCalories;
	}
	public void setMenCalories(double menCalories) {
		this.menCalories = menCalories;
	}
	public String getMenSpeciality() {
		return menSpeciality;
	}
	public void setMenSpeciality(String menSpeciality) {
		this.menSpeciality = menSpeciality;
	}
	@Override
	public String toString() {
		return "Menu [menId=" + menId + ", menItem=" + menItem + ", menPrice=" + menPrice + ", restaurantId="
				+ restaurantId + ", menCalories=" + menCalories + ", menSpeciality=" + menSpeciality + "]";
	}
	public Menu(int menId, String menItem, double menPrice, String restaurantId, double menCalories,
			String menSpeciality) {
		super();
		this.menId = menId;
		this.menItem = menItem;
		this.menPrice = menPrice;
		this.restaurantId = restaurantId;
		this.menCalories = menCalories;
		this.menSpeciality = menSpeciality;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
