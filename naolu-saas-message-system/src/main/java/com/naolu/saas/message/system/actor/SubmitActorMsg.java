package com.naolu.saas.message.system.actor;

import java.util.List;

import com.naolu.saas.message.base.UserIdMsg;

public class SubmitActorMsg {
	private UserIdMsg userId;
	private String smsCode;
	private String roleId;
	private Integer roleMask; // user(1)|agent(2)|admin(4)
	private String orgId;    // assigned when the actor creates organization;  
	private String deptId;   // default: null, 顶层是orgId
	private String channelId;
	private List<String> authorizedChanIds; 
	private String name;
	private String email;
	private String phone;
	private String password;
	private String inviteCode;
	private List<String> adminRegion;
	private Integer userType;  
	private Boolean isManager; //是否是部门管理员
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public Integer getRoleMask() {
		return roleMask;
	}
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsManager() {
		return isManager;
	}
	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public List<String> getAdminRegion() {
		return adminRegion;
	}
	public void setAdminRegion(List<String> adminRegion) {
		this.adminRegion = adminRegion;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public List<String> getAuthorizedChanIds() {
		return authorizedChanIds;
	}
	public void setAuthorizedChanIds(List<String> authorizedChanIds) {
		this.authorizedChanIds = authorizedChanIds;
	}
	public SubmitActorMsg() {
		super();
	}
	@Override
	public String toString() {
		return "SubmitActorMsg [userId=" + userId + ", smsCode=" + smsCode + ", roleId=" + roleId + ", roleMask="
				+ roleMask + ", orgId=" + orgId + ", deptId=" + deptId + ", channelId=" + channelId + ", authorizedChanIds="
				+ authorizedChanIds + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", inviteCode=" + inviteCode + ", adminRegion=" + adminRegion + ", userType=" + userType
				+ ", isManager=" + isManager + "]";
	}
	public SubmitActorMsg(UserIdMsg userId, String smsCode, String roleId, Integer roleMask, String orgId,
			String deptId, String channel, List<String> authorizedChanIds, String name, String email, String phone,
			String password, String inviteCode, List<String> adminRegion, Integer userType, Boolean isManager) {
		super();
		this.userId = userId;
		this.smsCode = smsCode;
		this.roleId = roleId;
		this.roleMask = roleMask;
		this.orgId = orgId;
		this.deptId = deptId;
		this.channelId = channelId;
		this.authorizedChanIds = authorizedChanIds;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.inviteCode = inviteCode;
		this.adminRegion = adminRegion;
		this.userType = userType;
		this.isManager = isManager;
	}
}
