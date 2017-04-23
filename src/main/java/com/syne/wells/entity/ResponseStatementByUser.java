package com.syne.wells.entity;

public class ResponseStatementByUser {

	private String mediaType;
	private String type;
	private StatementProperties properties;
	
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
	public StatementProperties getProperties() {
		return properties;
	}
	public void setProperties(StatementProperties properties) {
		this.properties = properties;
	} 
}
