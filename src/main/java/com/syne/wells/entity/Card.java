package com.syne.wells.entity;

public class Card {
	private int refid;
	private String cardNumber;
	private int levelOneNodeId;
	private int levelTwoNodeId;
	private String expirationDate;//: required (date-only)
	private boolean isActive;
	private int primaryApproverId;
	private int secondaryApproverId;

	private String creationDate;//: required (datetime)
	private String createdBy;
	private String lastupdatedDate;//: required (datetime)
	private String lastupdatedBy;
	
	private AccountParameter accountParameter;
	
	public AccountParameter getAccountParameter() {
		return accountParameter;
	}
	public void setAccountParameter(AccountParameter accountParameter) {
		this.accountParameter = accountParameter;
	}
	public int getRefid() {
		return refid;
	}
	public void setRefid(int refid) {
		this.refid = refid;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getLevelOneNodeId() {
		return levelOneNodeId;
	}
	public void setLevelOneNodeId(int levelOneNodeId) {
		this.levelOneNodeId = levelOneNodeId;
	}
	public int getLevelTwoNodeId() {
		return levelTwoNodeId;
	}
	public void setLevelTwoNodeId(int levelTwoNodeId) {
		this.levelTwoNodeId = levelTwoNodeId;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getPrimaryApproverId() {
		return primaryApproverId;
	}
	public void setPrimaryApproverId(int primaryApproverId) {
		this.primaryApproverId = primaryApproverId;
	}
	public int getSecondaryApproverId() {
		return secondaryApproverId;
	}
	public void setSecondaryApproverId(int secondaryApproverId) {
		this.secondaryApproverId = secondaryApproverId;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastupdatedDate() {
		return lastupdatedDate;
	}
	public void setLastupdatedDate(String lastupdatedDate) {
		this.lastupdatedDate = lastupdatedDate;
	}
	public String getLastupdatedBy() {
		return lastupdatedBy;
	}
	public void setLastupdatedBy(String lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}
}
