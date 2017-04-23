package com.syne.wells.entity;

public class CycleDetail {
	private String statementEndDate;// (date-only)
	private String graceStartDate;//: required (date-only)
	private int cycleSetupId;
	private String approvalStartDate;//: required (date-only)
	private String statmentStartDate;//: required (date-only)
	private String reminderEndDate;//: required (date-only)
	private String downloadEndDate;//: required (date-only)
	private String graceEndDate;//: required (date-only)
	private int runId;
	private String downloadStartDate;// Date-only
	private String reminderStartDate;//: required (date-only)
	private String approvalEndDate;//: required (date-only)
	
	public String getStatementEndDate() {
		return statementEndDate;
	}
	public void setStatementEndDate(String statementEndDate) {
		this.statementEndDate = statementEndDate;
	}
	public String getGraceStartDate() {
		return graceStartDate;
	}
	public void setGraceStartDate(String graceStartDate) {
		this.graceStartDate = graceStartDate;
	}
	public int getCycleSetupId() {
		return cycleSetupId;
	}
	public void setCycleSetupId(int cycleSetupId) {
		this.cycleSetupId = cycleSetupId;
	}
	public String getApprovalStartDate() {
		return approvalStartDate;
	}
	public void setApprovalStartDate(String approvalStartDate) {
		this.approvalStartDate = approvalStartDate;
	}
	public String getStatmentStartDate() {
		return statmentStartDate;
	}
	public void setStatmentStartDate(String statmentStartDate) {
		this.statmentStartDate = statmentStartDate;
	}
	public String getReminderEndDate() {
		return reminderEndDate;
	}
	public void setReminderEndDate(String reminderEndDate) {
		this.reminderEndDate = reminderEndDate;
	}
	public String getDownloadEndDate() {
		return downloadEndDate;
	}
	public void setDownloadEndDate(String downloadEndDate) {
		this.downloadEndDate = downloadEndDate;
	}
	public String getGraceEndDate() {
		return graceEndDate;
	}
	public void setGraceEndDate(String graceEndDate) {
		this.graceEndDate = graceEndDate;
	}
	public int getRunId() {
		return runId;
	}
	public void setRunId(int runId) {
		this.runId = runId;
	}
	public String getDownloadStartDate() {
		return downloadStartDate;
	}
	public void setDownloadStartDate(String downloadStartDate) {
		this.downloadStartDate = downloadStartDate;
	}
	public String getReminderStartDate() {
		return reminderStartDate;
	}
	public void setReminderStartDate(String reminderStartDate) {
		this.reminderStartDate = reminderStartDate;
	}
	public String getApprovalEndDate() {
		return approvalEndDate;
	}
	public void setApprovalEndDate(String approvalEndDate) {
		this.approvalEndDate = approvalEndDate;
	}
}
