package com.syne.wells.entity;

import java.util.List;

public class AccountParameter {
	private int creditLimit;
	private int dailyNumberOfTranLimit;
	private int monthlyNumberOfTranLimit;
	private int dailyDollarLimit;
	private int singlePurchaseLimit;
	private McStrategy mccStrategy;
	private List<CardItem> mccgroups;
	
	public enum McStrategy{
		Inclusion, Exclusion, Default, No_Restriction
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getDailyNumberOfTranLimit() {
		return dailyNumberOfTranLimit;
	}

	public void setDailyNumberOfTranLimit(int dailyNumberOfTranLimit) {
		this.dailyNumberOfTranLimit = dailyNumberOfTranLimit;
	}

	public int getMonthlyNumberOfTranLimit() {
		return monthlyNumberOfTranLimit;
	}

	public void setMonthlyNumberOfTranLimit(int monthlyNumberOfTranLimit) {
		this.monthlyNumberOfTranLimit = monthlyNumberOfTranLimit;
	}

	public int getDailyDollarLimit() {
		return dailyDollarLimit;
	}

	public void setDailyDollarLimit(int dailyDollarLimit) {
		this.dailyDollarLimit = dailyDollarLimit;
	}

	public int getSinglePurchaseLimit() {
		return singlePurchaseLimit;
	}

	public void setSinglePurchaseLimit(int singlePurchaseLimit) {
		this.singlePurchaseLimit = singlePurchaseLimit;
	}

	public McStrategy getMccStrategy() {
		return mccStrategy;
	}

	public void setMccStrategy(McStrategy mccStrategy) {
		this.mccStrategy = mccStrategy;
	}

	public List<CardItem> getMccgroups() {
		return mccgroups;
	}

	public void setMccgroups(List<CardItem> mccgroups) {
		this.mccgroups = mccgroups;
	}
}
