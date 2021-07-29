package com.naolu.saas.message.system.actor;

import com.naolu.saas.message.base.UserIdMsg;

public class EnableActorMsg {
	private UserIdMsg userId;
	private String actorId;

	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public EnableActorMsg(UserIdMsg userId, String actorId) {
		super();
		this.userId = userId;
		this.actorId = actorId;
	}
	@Override
	public String toString() {
		return "EnableActorMsg [userId=" + userId + ", actorId=" + actorId + "]";
	}
	public EnableActorMsg() {
		super();
	}
	
}
