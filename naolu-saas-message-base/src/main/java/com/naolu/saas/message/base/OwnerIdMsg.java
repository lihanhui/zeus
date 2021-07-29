package com.naolu.saas.message.base;

public class OwnerIdMsg {
	private String creatorId;
	// agent(one kind of actor) who manage the business on behalf of the renter 
	private String agentId;
	private String ownerId;
	private String orgId;
	private String deptId;
	private String channelId;
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public OwnerIdMsg(String creatorId, String agentId, String ownerId, String orgId, String deptId, String channelId) {
		super();
		this.creatorId = creatorId;
		this.agentId = agentId;
		this.ownerId = ownerId;
		this.orgId = orgId;
		this.deptId = deptId;
		this.channelId = channelId;
	}
	@Override
	public String toString() {
		return "OwnerIdMsg [creatorId=" + creatorId + ", agentId=" + agentId + ", ownerId=" + ownerId + ", orgId="
				+ orgId + ", deptId=" + deptId + ", channelId=" + channelId + "]";
	}
	public OwnerIdMsg() {
		super();
	}
	
}
