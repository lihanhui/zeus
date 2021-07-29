package com.naolu.saas.message.system.actor;

import java.util.List;

import com.naolu.saas.message.base.TokenMsg;

public class ActorMsg2 {
	private String actorId;
	private String roleId;
	private Integer roleMask; 	// user(1)|agent(2)|admin(4)
	private String orgId;    	// assigned when the actor creates organization;  
	private String deptId;   	// default: null, 顶层是orgId
	private String channelId;
	private List<String> authorizedChanIds; 
	private String name;
	private String email;
	private String phone;
	private String password;
	private List<String> adminRegion;
	private Integer userType;
	public TokenMsg token;

	public TokenMsg getToken() {
		return token;
	}
	public void setToken(TokenMsg token) {
		this.token = token;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getAdminRegion() {
		return adminRegion;
	}
	public void setAdminRegion(List<String> adminRegion) {
		this.adminRegion = adminRegion;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public ActorMsg2() {
		super();
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
	@Override
	public String toString() {
		return "ActorMsg2 [actorId=" + actorId + ", roleId=" + roleId + ", roleMask=" + roleMask + ", orgId=" + orgId
				+ ", deptId=" + deptId + ", channelId=" + channelId + ", authorizedChanIds=" + authorizedChanIds + ", name="
				+ name + ", email=" + email + ", phone=" + phone + ", password=" + password + ", adminRegion="
				+ adminRegion + ", userType=" + userType + ", token=" + token + "]";
	}
	public ActorMsg2(String actorId, String roleId, Integer roleMask, String orgId, String deptId, String channelId,
			List<String> authorizedChanIds, String name, String email, String phone, String password,
			List<String> adminRegion, Integer userType, TokenMsg token) {
		super();
		this.actorId = actorId;
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
		this.adminRegion = adminRegion;
		this.userType = userType;
		this.token = token;
	}
	
}
