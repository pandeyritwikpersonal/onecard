package com.syne.wells.service.impl;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.syne.wells.entity.CycleDetail;
import com.syne.wells.entity.ResponseStatementByCardAndType;
import com.syne.wells.entity.StatementByCardAndTypeProperties;
import com.syne.wells.entity.StatementByCardAndTypeProperties.Status;
import com.syne.wells.entity.ResponseStatementByUser;
import com.syne.wells.entity.StatementProperties;
import com.syne.wells.service.StatementService;
import com.syne.wells.util.Utility;

@Service
public class StatementServiceImpl implements StatementService {

	@Override
	public String getStatementStatusyUser() {
		ResponseStatementByUser statementResponse = new ResponseStatementByUser();
		statementResponse.setMediaType("application/json");
		StatementProperties properties = new StatementProperties();
		properties.setCompletedApprovalCount(1000);
		properties.setDivisionId(101);
		properties.setPendingApprovalCount(50);
		properties.setPendingApprovalOOPCount(80);
		properties.setPendingReviewCount(100);
		properties.setPendingSubmittionCount(20);
		properties.setReadyForApprovalCount(70);
		properties.setSubmittedForApprovalCount(90);
		statementResponse.setProperties(properties);
		statementResponse.setType("object");
		return new JSONObject(statementResponse).toString();
	}

	@Override
	public String getStatementByCardAndType() {
		
		ResponseStatementByCardAndType response = new ResponseStatementByCardAndType();
		
		StatementByCardAndTypeProperties statementResponse = new StatementByCardAndTypeProperties();
		statementResponse.setChargesAmount(10000);
		statementResponse.setChargesCount(100);
		statementResponse.setFaxPrintDate(Utility.getDateAndTime(new Date()));
		statementResponse.setImageAvailableDate(Utility.getDateAndTime(new Date()));
		statementResponse.setOopAmount(9000);
		statementResponse.setOopCount(700);
		statementResponse.setReceiptCount(20);
		statementResponse.setStatus(Status.Approved);
		statementResponse.setStmtId(12);
		statementResponse.setTotalAmount(20000);
		
		CycleDetail cycleDetail = new CycleDetail();
		cycleDetail.setApprovalEndDate(Utility.getDateOnly(new Date()));
		cycleDetail.setApprovalStartDate(Utility.getDateOnly(new Date()));
		cycleDetail.setCycleSetupId(10);
		cycleDetail.setDownloadEndDate(Utility.getDateOnly(new Date()));
		cycleDetail.setDownloadStartDate(Utility.getDateOnly(new Date()));
		cycleDetail.setGraceEndDate(Utility.getDateOnly(new Date()));
		cycleDetail.setGraceStartDate(Utility.getDateOnly(new Date()));
		cycleDetail.setReminderEndDate(Utility.getDateOnly(new Date()));
		cycleDetail.setReminderStartDate(Utility.getDateOnly(new Date()));
		cycleDetail.setRunId(43);
		cycleDetail.setStatementEndDate(Utility.getDateOnly(new Date()));
		cycleDetail.setStatmentStartDate(Utility.getDateOnly(new Date()));
		statementResponse.setCycleDetail(cycleDetail);
		
		response.setMediaType("application/json");
		response.setType("Object");
		response.setProperties(statementResponse);
		return new JSONObject(response).toString();
	}

}
