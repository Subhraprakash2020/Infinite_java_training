package com.java.ejb;

public class InsurancePlan {
	private int planId;
	private int insId;
	private String payMode;
	private Double initialAmount;
	private double premiumAmount;
	private double coverageAmount;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getInsId() {
		return insId;
	}
	public void setInsId(int insId) {
		this.insId = insId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public Double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(Double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public double getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	
	
	
	
}
