package com.naolu.saas.message.system.actor;

import java.util.List;

import com.naolu.saas.message.base.UserIdMsg;

public class GetActorListMsg {
	private UserIdMsg userId;
	private List<String> actorIds;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public List<String> getActorIds() {
		return actorIds;
	}
	public void setActorIds(List<String> actorIds) {
		this.actorIds = actorIds;
	}
	public GetActorListMsg(UserIdMsg userId, List<String> actorIds) {
		super();
		this.userId = userId;
		this.actorIds = actorIds;
	}
	@Override
	public String toString() {
		return "GetActorListMsg [userId=" + userId + ", actorIds=" + actorIds + "]";
	}
	public GetActorListMsg() {
		super();
	}
	
}
