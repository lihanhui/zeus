package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class QueryPagedMenuMsg {
	private UserIdMsg userId;
	private String menuId;
	private String menuName;
	private String menuCode; 		// for frontend to match menu
	private String parentMenuCode; 	// for frontend to match menu
	private Integer pageNumber;
	private Integer pageSize;
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
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public QueryPagedMenuMsg(UserIdMsg userId, String menuId, String menuName, String menuCode, String parentMenuCode,
			Integer pageNumber, Integer pageSize) {
		super();
		this.userId = userId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuCode = menuCode;
		this.parentMenuCode = parentMenuCode;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "QueryPagedMenuMsg [userId=" + userId + ", menuId=" + menuId + ", menuName=" + menuName + ", menuCode="
				+ menuCode + ", parentMenuCode=" + parentMenuCode + ", pageNumber=" + pageNumber + ", pageSize="
				+ pageSize + "]";
	}
	public QueryPagedMenuMsg() {
		super();
	}
	
}
