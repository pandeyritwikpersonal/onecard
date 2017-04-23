package com.syne.wells.entity;

import java.util.List;

public class ResponseCardByUser {

	private String mediaType;
	private String type;
	private List<Card> items;
	
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Card> getItems() {
		return items;
	}
	public void setItems(List<Card> items) {
		this.items = items;
	}
}
