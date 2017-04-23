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

import com.syne.wells.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login/{version}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
    public String login(@PathVariable String version, @RequestHeader(value="senderMessageId") String senderMessageId,
    		 @RequestHeader(value="senderMessageIdEcho") String senderMessageIdEcho
    		, @RequestHeader(value="senderApplicationId") String senderApplicationId
    		, @RequestHeader(value="sessionId") String sessionId
    		, @RequestHeader(value="originatingApplicationId") String originatingApplicationId
    		, @RequestHeader(value="wf-cc-userid") String wfCcUserid
    		, @RequestHeader(value="wf-user-csid") String wfUserCsid
    		, @RequestHeader(value="wf-company-csid") String wfCompanyCsid) {
        return userService.getUserLogin();
    }
	
	
	@RequestMapping(value = "/getManagedDivisions/{version}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
    public String mangedDivisions(@PathVariable String version, @RequestBody Map<String, Object> payload
    		, @RequestHeader(value="senderMessageId") String senderMessageId
    		, @RequestHeader(value="senderMessageIdEcho") String senderMessageIdEcho
    		, @RequestHeader(value="senderApplicationId") String senderApplicationId
    		, @RequestHeader(value="sessionId") String sessionId
    		, @RequestHeader(value="originatingApplicationId") String originatingApplicationId
    		, @RequestHeader(value="wf-cc-userid") String wfCcUserid
    		, @RequestHeader(value="wf-user-csid") String wfUserCsid
    		, @RequestHeader(value="wf-company-csid") String wfCompanyCsid) {
		if(payload.get("userId")==null){
			JSONObject err = new JSONObject();
			err.put("message", "userId is mandatory in body");
			return err.toString();
		}
        return userService.getDivisions();
    }
}
