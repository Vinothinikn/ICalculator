package com.calculator.dto;

public class UserInfoDTO {

	private String name = "name";
	private String crushName = "crush";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [name=" + name + ", crushName=" + crushName + "]";
	}

}
