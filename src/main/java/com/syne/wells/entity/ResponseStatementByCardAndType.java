package com.syne.wells.entity;

public class ResponseStatementByCardAndType {
	
	private String mediaType;
	private String type;
	private StatementByCardAndTypeProperties properties;
	
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
	public StatementByCardAndTypeProperties getProperties() {
		return properties;
	}
	public void setProperties(StatementByCardAndTypeProperties properties) {
		this.properties = properties;
	}
}
