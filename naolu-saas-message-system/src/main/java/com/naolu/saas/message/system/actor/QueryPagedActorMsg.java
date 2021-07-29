package com.naolu.saas.message.system.actor;

import com.naolu.saas.message.base.UserIdMsg;

public class QueryPagedActorMsg {
	private UserIdMsg userId;
	private String actorId;
	private String roleId;
	private Integer roleMask; // user(1)|agent(2)|admin(4)
	private String orgId;    // assigned when the actor creates organization;  
	private String deptId;   // default: null, 顶层是orgId
	private String name;
	private String email;
	private String phone;
	private Integer userType;
	private Integer pageNumber;
	private Integer pageSize;
	
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
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public QueryPagedActorMsg(UserIdMsg userId, String actorId, String roleId, Integer roleMask, String orgId,
			String deptId, String name, String email, String phone, Integer userType, Integer pageNumber,
			Integer pageSize) {
		super();
		this.userId = userId;
		this.actorId = actorId;
		this.roleId = roleId;
		this.roleMask = roleMask;
		this.orgId = orgId;
		this.deptId = deptId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userType = userType;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "QueryPagedActorMsg [userId=" + userId + ", actorId=" + actorId + ", roleId=" + roleId + ", roleMask="
				+ roleMask + ", orgId=" + orgId + ", deptId=" + deptId + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", userType=" + userType + ", pageNumber=" + pageNumber + ", pageSize="
				+ pageSize + "]";
	}
	public QueryPagedActorMsg() {
		super();
	}
	
}
