package com.syne.wells.entity;

public class StatementByCardAndTypeProperties {
	
	private int stmtId;
	private int receiptCount;
	private int totalAmount;
	private int oopAmount;
	private String faxPrintDate;// (datetime)
	private String imageAvailableDate;//(datetime)
	private CycleDetail cycleDetail;
	private Status status;//: required (one of Open, Closed, Reviewed, Approved)
	private int oopCount;
	private int chargesAmount;
	private int chargesCount;
	
	public enum Status{
		Open, Closed, Reviewed, Approved
	}

	public int getStmtId() {
		return stmtId;
	}

	public void setStmtId(int stmtId) {
		this.stmtId = stmtId;
	}

	public int getReceiptCount() {
		return receiptCount;
	}

	public void setReceiptCount(int receiptCount) {
		this.receiptCount = receiptCount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getOopAmount() {
		return oopAmount;
	}

	public void setOopAmount(int oopAmount) {
		this.oopAmount = oopAmount;
	}

	public String getFaxPrintDate() {
		return faxPrintDate;
	}

	public void setFaxPrintDate(String faxPrintDate) {
		this.faxPrintDate = faxPrintDate;
	}

	public String getImageAvailableDate() {
		return imageAvailableDate;
	}

	public void setImageAvailableDate(String imageAvailableDate) {
		this.imageAvailableDate = imageAvailableDate;
	}

	public CycleDetail getCycleDetail() {
		return cycleDetail;
	}

	public void setCycleDetail(CycleDetail cycleDetail) {
		this.cycleDetail = cycleDetail;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getOopCount() {
		return oopCount;
	}

	public void setOopCount(int oopCount) {
		this.oopCount = oopCount;
	}

	public int getChargesAmount() {
		return chargesAmount;
	}

	public void setChargesAmount(int chargesAmount) {
		this.chargesAmount = chargesAmount;
	}

	public int getChargesCount() {
		return chargesCount;
	}

	public void setChargesCount(int chargesCount) {
		this.chargesCount = chargesCount;
	}
}
