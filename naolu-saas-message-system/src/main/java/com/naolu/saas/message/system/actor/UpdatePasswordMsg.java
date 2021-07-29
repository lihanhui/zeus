package com.naolu.saas.message.system.actor;

import com.naolu.saas.message.base.UserIdMsg;

public class UpdatePasswordMsg {
	private UserIdMsg userId;
	private String oldPassword;
	private String password;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UpdatePasswordMsg(UserIdMsg userId, String oldPassword, String password) {
		super();
		this.userId = userId;
		this.oldPassword = oldPassword;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UpdatePasswordMsg [userId=" + userId + ", oldPassword=" + oldPassword + ", password=" + password + "]";
	}
	public UpdatePasswordMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
