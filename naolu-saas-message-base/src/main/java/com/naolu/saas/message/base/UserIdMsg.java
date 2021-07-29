package com.naolu.saas.message.base;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.naolu.meta.role.RoleType;

public class UserIdMsg {
	private String userId;
	private String orgId;
	private String deptId;
	private Integer roleMask; //user-0x01/agent-0x02/admin-0x04/ + manager-0x8000
	private String channelId;
	private List<String>  authorizedChanIds;
	
	private static Boolean authenticated(UserIdMsg userId) {
		Integer roleMask = userId.getRoleMask();
		String channelId = userId.getChannelId();
		if(channelId == null || roleMask == null 
				|| RoleType.valueOf(roleMask) == null) { return false; } // must be non null
		
		if( !RoleType.isRole(RoleType.ADMIN, roleMask) && !RoleType.isRole(RoleType.AGENT, roleMask)) { // non admin
			return false;
		}
		return true;
	}
	public static Boolean isSuperAdmin(UserIdMsg userId) { // must be admin and not attached to any channels
		Integer mask = userId.getRoleMask();
		List<String> authorizedChanIds = userId.getAuthorizedChanIds();
		return authenticated(userId) && RoleType.isRole(RoleType.ADMIN, mask) && (authorizedChanIds == null || authorizedChanIds.size() == 0);
	}
	public static List<String> toChannelIds(UserIdMsg userId) {
		if( !authenticated(userId) ) return new LinkedList<String>();
		
		String channelId = userId.getChannelId();
		List<String> authorizedChanIds = userId.getAuthorizedChanIds();
		if(authorizedChanIds != null && authorizedChanIds.size() > 0) {
			return new LinkedList<String>(authorizedChanIds);
		}else if(channelId != null){
			return new LinkedList<String>(Arrays.asList(channelId));
		}else {
			return new LinkedList<String>();
		}
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public Integer getRoleMask() {
		return roleMask;
	}
	public void setRoleMask(Integer roleMask) {
		this.roleMask = roleMask;
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
		return "UserIdMsg [userId=" + userId + ", orgId=" + orgId + ", deptId=" + deptId + ", roleMask=" + roleMask
				+ ", channelId=" + channelId + ", authorizedChanIds=" + authorizedChanIds + "]";
	}
	public UserIdMsg(String userId, String orgId, String deptId, Integer roleMask, String channelId) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.deptId = deptId;
		this.roleMask = roleMask;
		this.channelId = channelId;
	}
	public UserIdMsg(String userId, String orgId, String deptId, Integer roleMask, String channelId,
			List<String> authorizedChanIds) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.deptId = deptId;
		this.roleMask = roleMask;
		this.channelId = channelId;
		this.authorizedChanIds = authorizedChanIds;
	}
	public UserIdMsg(String userId, String orgId, String deptId, Integer roleMask) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.deptId = deptId;
		this.roleMask = roleMask;
	}
	public UserIdMsg() {
		super();
	}
	
}
