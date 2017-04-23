package com.syne.wells.entity;

import java.util.List;

public class ResponseManagedDivisions {

	private String mediaType;
	private String type;
	private List<Division> items;
	
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
	public List<Division> getItems() {
		return items;
	}
	public void setItems(List<Division> items) {
		this.items = items;
	}	
}
