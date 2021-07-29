package com.naolu.saas.message.system.org;

import com.naolu.saas.message.base.UserIdMsg;

public class GetOrganizationMsg {
	private UserIdMsg userId; 
	private String orgId;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	@Override
	public String toString() {
		return "GetOrganizationMsg [userId=" + userId + ", orgId=" + orgId + "]";
	}
	public GetOrganizationMsg(UserIdMsg userId, String orgId) {
		super();
		this.userId = userId;
		this.orgId = orgId;
	}
	public GetOrganizationMsg() {
		super();
	}
	
}
