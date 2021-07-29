package com.naolu.saas.message.system.permission;

import java.util.List;

import com.naolu.saas.message.base.UserIdMsg;

public class UpdateMenuMsg {
	private UserIdMsg userId;
	private String menuCode; // for frontend to match menu
	private String menuName;
	private String menuId;
	private String parentMenuCode;
	private List<String> apis;
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public List<String> getApis() {
		return apis;
	}
	public void setApis(List<String> apis) {
		this.apis = apis;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getParentMenuCode() {
		return parentMenuCode;
	}
	public void setParentMenuCode(String parentMenuCode) {
		this.parentMenuCode = parentMenuCode;
	}
	public UpdateMenuMsg(UserIdMsg userId, String menuCode, String menuName, String menuId, String parentMenuCode,
			List<String> apis) {
		super();
		this.userId = userId;
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.menuId = menuId;
		this.parentMenuCode = parentMenuCode;
		this.apis = apis;
	}
	@Override
	public String toString() {
		return "UpdateMenuMsg [userId=" + userId + ", menuCode=" + menuCode + ", menuName=" + menuName + ", menuId="
				+ menuId + ", parentMenuCode=" + parentMenuCode + ", apis=" + apis + "]";
	}
	public UpdateMenuMsg() {
		super();
	}
	
}
