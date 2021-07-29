package com.naolu.saas.message.system.permission;

import java.util.List;

import com.naolu.saas.message.base.UserIdMsg;

public class SubmitMenuMsg {
	private UserIdMsg userId;
	private String menuCode; // for frontend to match menu
	private String menuName;
	private String parentMenuCode;
	private List<String> apis;
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
	public SubmitMenuMsg(UserIdMsg userId, String menuCode, String menuName, String parentMenuCode, List<String> apis) {
		super();
		this.userId = userId;
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.parentMenuCode = parentMenuCode;
		this.apis = apis;
	}
	@Override
	public String toString() {
		return "SubmitMenuMsg [userId=" + userId + ", menuCode=" + menuCode + ", menuName=" + menuName
				+ ", parentMenuCode=" + parentMenuCode + ", apis=" + apis + "]";
	}
	public SubmitMenuMsg() {
		super();
	}
	
}
