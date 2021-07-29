package com.naolu.saas.message.system.actor;

import com.naolu.saas.message.base.UserIdMsg;

public class GetActorMsg {
	private UserIdMsg userId;
	private String actorId;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	@Override
	public String toString() {
		return "GetActorMsg [userId=" + userId + ", actorId=" + actorId + "]";
	}
	public GetActorMsg(UserIdMsg userId, String actorId) {
		super();
		this.userId = userId;
		this.actorId = actorId;
	}
	public GetActorMsg() {
		super();
	}
	
}
