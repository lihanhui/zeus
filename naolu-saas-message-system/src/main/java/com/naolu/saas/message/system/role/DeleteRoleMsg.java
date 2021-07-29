package com.naolu.saas.message.system.role;

import com.naolu.saas.message.base.UserIdMsg;

public class DeleteRoleMsg {
	private UserIdMsg userId;
	private String roleId;

	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public DeleteRoleMsg(UserIdMsg userId, String roleId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "DeleteRoleMsg [userId=" + userId + ", roleId=" + roleId + "]";
	}
	public DeleteRoleMsg() {
		super();
	}
	
}