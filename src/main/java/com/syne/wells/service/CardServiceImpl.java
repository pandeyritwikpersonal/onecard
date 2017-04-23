package com.syne.wells.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.syne.wells.entity.AccountParameter;
import com.syne.wells.entity.AccountParameter.McStrategy;
import com.syne.wells.entity.Card;
import com.syne.wells.entity.CardItem;
import com.syne.wells.entity.ResponseCardByUser;
import com.syne.wells.entity.ResponseCardCreditLimit;
import com.syne.wells.util.Utility;

@Service
public class CardServiceImpl implements CardService {
	
	@Override
	public String getCardsByUserId() {
		List<Card> cards = new ArrayList<>();
		Card card = new Card();
		card.setActive(true);
		card.setCardNumber("CARD1234");
		card.setCreatedBy("System");
		card.setCreationDate(Utility.getDateAndTime(new Date()));
		card.setExpirationDate(Utility.getDateOnly(new Date()));
		card.setLastupdatedBy("System");
		card.setLastupdatedDate(Utility.getDateAndTime(new Date()));
		card.setLevelOneNodeId(1);
		card.setLevelTwoNodeId(89);
		card.setPrimaryApproverId(14111);
		card.setRefid(1113);
		card.setSecondaryApproverId(607324);
		
		AccountParameter param = new AccountParameter();
		param.setCreditLimit(19000);
		param.setDailyDollarLimit(2000);
		param.setDailyNumberOfTranLimit(5);
		param.setMccStrategy(McStrategy.Default);
		param.setMonthlyNumberOfTranLimit(8);
		param.setSinglePurchaseLimit(4000);
		param.setMccgroups(new ArrayList<>());
		CardItem item = new CardItem();
		item.setEntryNumber(1234);
		item.setGroupId("VGDFW");
		item.setGroupName("GROUP-A");
		param.getMccgroups().add(item);
		item = new CardItem();
		item.setEntryNumber(5678);
		item.setGroupId("GHTRF");
		item.setGroupName("GROUP-B");
		param.getMccgroups().add(item);
		
		card.setAccountParameter(param);
		cards.add(card);
		
		ResponseCardByUser cardResponse = new ResponseCardByUser();
		cardResponse.setMediaType("application/json");
		cardResponse.setType("Array of cards");
		JSONArray array = new JSONArray(cards);
		JSONObject object = new JSONObject(cardResponse);
		object.put("items", array);
		return object.toString();
	}

	@Override
	public String getCreditLimitChangeCount() {
		ResponseCardCreditLimit cardResponse = new ResponseCardCreditLimit();
		cardResponse.setMediaType("application/json");
		cardResponse.setType("integer");
		return new JSONObject(cardResponse).toString();
	}

}
