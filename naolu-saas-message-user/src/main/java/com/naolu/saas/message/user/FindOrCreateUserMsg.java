package com.naolu.saas.message.user;

import com.naolu.saas.message.base.UserIdMsg;

public class FindOrCreateUserMsg {
	private UserIdMsg userId;
	private String phone;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "FindOrCreateUserMsg [userId=" + userId + ", phone=" + phone + "]";
	}
	public FindOrCreateUserMsg(UserIdMsg userId, String phone) {
		super();
		this.userId = userId;
		this.phone = phone;
	}
	public FindOrCreateUserMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
}
