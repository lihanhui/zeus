package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class DeleteApiMsg {
	private UserIdMsg userId;
	private String apiId;

	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public DeleteApiMsg(UserIdMsg userId, String apiId) {
		super();
		this.userId = userId;
		this.apiId = apiId;
	}
	@Override
	public String toString() {
		return "DeleteApiMsg [userId=" + userId + ", apiId=" + apiId + "]";
	}
	public DeleteApiMsg() {
		super();
	}
	
}
