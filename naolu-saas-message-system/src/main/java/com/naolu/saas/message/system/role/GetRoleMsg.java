package com.naolu.saas.message.system.role;

import com.naolu.saas.message.base.UserIdMsg;

public class GetRoleMsg {
	private UserIdMsg userId;
	private String roleId;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "GetRoleMsg [userId=" + userId + ", roleId=" + roleId + "]";
	}
	public GetRoleMsg(UserIdMsg userId, String roleId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
	}
	public GetRoleMsg() {
		super();
	}
}
