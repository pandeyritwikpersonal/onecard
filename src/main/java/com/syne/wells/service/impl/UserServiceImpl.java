package com.syne.wells.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.syne.wells.entity.Division;
import com.syne.wells.entity.ResponseManagedDivisions;
import com.syne.wells.entity.ResponseUserLogin;
import com.syne.wells.entity.UserLoginItem;
import com.syne.wells.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String getUserLogin() {
		ResponseUserLogin userLogin = new ResponseUserLogin();
		userLogin.setActive(true);
		userLogin.setCreatedBy("System");
		userLogin.setCreatedOn(new Date());
		userLogin.setEmail("test@synechron.com");
		userLogin.setEnabled(true);
		userLogin.setFirstName("First");
		userLogin.setId(1);
		userLogin.setLastName("Last");
		userLogin.setMediaType("application/json");
		userLogin.setMiddleName("Middle");
		userLogin.setType("object");
		userLogin.setUniqueId("XRTS673A");
		userLogin.setUpdatedBy("System");
		userLogin.setUpdatedOn(new Date());
		userLogin.setViewOnly(false);
		
		List<UserLoginItem> privileges = new ArrayList<>();
		UserLoginItem item = new UserLoginItem();
		item.setId(1);
		item.setName("Name1");
		privileges.add(item);
		item = new UserLoginItem();
		item.setId(2);
		item.setName("Name2");
		privileges.add(item);
		userLogin.setPrivileges(privileges);
		
		// Convert to JSON
		JSONObject loginResponse = new JSONObject(userLogin);
		JSONArray privileged = new JSONArray(privileges);
		loginResponse.put("privileges", privileged);
		
		return loginResponse.toString();
	}

	@Override
	public String getDivisions() {
		ResponseManagedDivisions division = new ResponseManagedDivisions();
		List<Division> divs = new ArrayList<>();
		Division div = new Division();
		div.setCode(101);
		div.setId(121);
		div.setName("Sample Name");
		div.setTsysId(1001);
		div.setTsysLevel(Division.SysLevel.LEVEL1);
		divs.add(div);
		
		div = new Division();
		div.setCode(102);
		div.setId(122);
		div.setName("Another Sample Name");
		div.setTsysId(1002);
		div.setTsysLevel(Division.SysLevel.LEVEL2);
		divs.add(div);
		
		division.setItems(divs);
		division.setMediaType("application/json");
		division.setType("array of Division");
		
		JSONObject divisionResponse = new JSONObject(division);
		JSONArray items = new JSONArray(divs);
		divisionResponse.put("items", items);
		return divisionResponse.toString();
	}
	
}
