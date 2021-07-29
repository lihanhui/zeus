package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class DeleteMenuMsg {
	private UserIdMsg userId;
	private String menuId;

	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public DeleteMenuMsg(UserIdMsg userId, String menuId) {
		super();
		this.userId = userId;
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "DeleteMenuMsg [userId=" + userId + ", menuId=" + menuId + "]";
	}
	public DeleteMenuMsg() {
		super();
	}
	
}
