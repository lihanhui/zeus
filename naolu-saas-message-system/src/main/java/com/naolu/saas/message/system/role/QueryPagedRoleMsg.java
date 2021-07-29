package com.naolu.saas.message.system.role;

import com.naolu.saas.message.base.UserIdMsg;

public class QueryPagedRoleMsg {
	private UserIdMsg userId;
	private String roleId;
	private String name;
	private Integer pageNumber;
	private Integer pageSize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public QueryPagedRoleMsg(UserIdMsg userId, String roleId, String name, Integer pageNumber, Integer pageSize) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.name = name;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "QueryPagedRoleMsg [userId=" + userId + ", roleId=" + roleId + ", name=" + name + ", pageNumber="
				+ pageNumber + ", pageSize=" + pageSize + "]";
	}
	public QueryPagedRoleMsg() {
		super();
	}
	
}
