package com.naolu.saas.message.system.actor;

import com.naolu.saas.message.base.UserIdMsg;

public class UpdateActorRoleMsg {
	private UserIdMsg userId;
	private String actorId;
	private String roleId;
	private Integer roleMask; // user(1)|agent(2)|admin(4)
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
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public Integer getRoleMask() {
		return roleMask;
	}
	public void setRoleMask(Integer roleMask) {
		this.roleMask = roleMask;
	}
	public UpdateActorRoleMsg(UserIdMsg userId, String actorId, String roleId, Integer roleMask) {
		super();
		this.userId = userId;
		this.actorId = actorId;
		this.roleId = roleId;
		this.roleMask = roleMask;
	}
	@Override
	public String toString() {
		return "UpdateActorRoleMsg [userId=" + userId + ", actorId=" + actorId + ", roleId=" + roleId + ", roleMask="
				+ roleMask + "]";
	}
	public UpdateActorRoleMsg() {
		super();
	}
}
