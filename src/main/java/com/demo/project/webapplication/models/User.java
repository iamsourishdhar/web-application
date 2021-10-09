package com.demo.project.webapplication.models;

public class User {
	private long userId;
	private String userName;
	private String birthDay;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public User(long userId, String userName, String birthDay) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.birthDay = birthDay;
	}
	

}
