package com.syne.wells.entity;

public class Division {
	private int id;
	private String name;
	private int code;
	private int tsysId;
	private SysLevel tsysLevel;

	public enum SysLevel {
		LEVEL1, LEVEL2
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getTsysId() {
		return tsysId;
	}

	public void setTsysId(int tsysId) {
		this.tsysId = tsysId;
	}

	public SysLevel getTsysLevel() {
		return tsysLevel;
	}

	public void setTsysLevel(SysLevel tsysLevel) {
		this.tsysLevel = tsysLevel;
	}
}
