package com.syne.wells.controller;

import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syne.wells.service.CardService;

@RestController
@RequestMapping("/")
public class CardController {

	public static final Logger logger = LoggerFactory.getLogger(CardController.class);

	@Autowired
	private CardService cardService;
	
	@RequestMapping(value = "/getCardsByUserId/{version}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String statementStatusByUser(@PathVariable String version, @RequestBody Map<String, Object> payload,
			@RequestHeader(value = "senderMessageId") String senderMessageId,
			@RequestHeader(value = "senderMessageIdEcho") String senderMessageIdEcho,
			@RequestHeader(value = "senderApplicationId") String senderApplicationId,
			@RequestHeader(value = "sessionId") String sessionId,
			@RequestHeader(value = "originatingApplicationId") String originatingApplicationId,
			@RequestHeader(value = "wf-cc-userid") String wfCcUserid,
			@RequestHeader(value = "wf-user-csid") String wfUserCsid,
			@RequestHeader(value = "wf-company-csid") String wfCompanyCsid) {
		if (payload.get("userId") == null) {
			JSONObject err = new JSONObject();
			err.put("message", "userId is mandatory in body");
			return err.toString();
		}
		return cardService.getCardsByUserId();
	}

	@RequestMapping(value = "/getCreditLimitChangeCount/{version}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public String creditLimitChangeCount(@PathVariable String version, @RequestBody Map<String, Object> payload,
			@RequestHeader(value = "senderMessageId") String senderMessageId,
			@RequestHeader(value = "senderMessageIdEcho") String senderMessageIdEcho,
			@RequestHeader(value = "senderApplicationId") String senderApplicationId,
			@RequestHeader(value = "sessionId") String sessionId,
			@RequestHeader(value = "originatingApplicationId") String originatingApplicationId,
			@RequestHeader(value = "wf-cc-userid") String wfCcUserid,
			@RequestHeader(value = "wf-user-csid") String wfUserCsid,
			@RequestHeader(value = "wf-company-csid") String wfCompanyCsid) {
		if (payload.get("userId") == null) {
			JSONObject err = new JSONObject();
			err.put("message", "userId is mandatory in body");
			return err.toString();
		}
		return cardService.getCreditLimitChangeCount();
	}
	
}
