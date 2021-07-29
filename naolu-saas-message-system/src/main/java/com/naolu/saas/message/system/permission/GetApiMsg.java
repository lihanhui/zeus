package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class GetApiMsg {
	private UserIdMsg userId;
	private String apiId;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	@Override
	public String toString() {
		return "GetApiMsg [userId=" + userId + ", apiId=" + apiId + "]";
	}
	public GetApiMsg(UserIdMsg userId, String apiId) {
		super();
		this.userId = userId;
		this.apiId = apiId;
	}
	public GetApiMsg() {
		super();
	}
	
}
