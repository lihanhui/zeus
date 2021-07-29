package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class GetMenuMsg {
	private UserIdMsg userId;
	private String menuId;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "GetMenuMsg [userId=" + userId + ", menuId=" + menuId + "]";
	}
	public GetMenuMsg(UserIdMsg userId, String menuId) {
		super();
		this.userId = userId;
		this.menuId = menuId;
	}
	public GetMenuMsg() {
		super();
	}
	
}
