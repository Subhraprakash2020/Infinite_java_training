package com.java.ejb;

import java.util.Date;

public class CustPolicy {
	private int policyId;
	private int custId;
	private int insId;
	private int planId;
	private double insAmount;
	private String paymode;
	private double initialAmount;
	private Date regdDate;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getInsId() {
		return insId;
	}
	public void setInsId(int insId) {
		this.insId = insId;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public double getInsAmount() {
		return insAmount;
	}
	public void setInsAmount(double insAmount) {
		this.insAmount = insAmount;
	}
	public String getPaymode() {
		return paymode;
	}
	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}
	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public Date getRegdDate() {
		return regdDate;
	}
	public void setRegdDate(Date regdDate) {
		this.regdDate = regdDate;
	}
	
	
	
}
