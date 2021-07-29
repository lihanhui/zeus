package com.naolu.saas.message.system.role;

import java.util.List;

import com.naolu.saas.message.base.UserIdMsg;

public class UpdateRoleMsg {
	private UserIdMsg userId;
	private String roleId;
	private String name;
	private String note;
	private List<String> menuIds;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public List<String> getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(List<String> menuIds) {
		this.menuIds = menuIds;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public UpdateRoleMsg(UserIdMsg userId, String roleId, String name, String note, List<String> menuIds) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.name = name;
		this.note = note;
		this.menuIds = menuIds;
	}
	@Override
	public String toString() {
		return "UpdateRoleMsg [userId=" + userId + ", roleId=" + roleId + ", name=" + name + ", note=" + note
				+ ", menuIds=" + menuIds + "]";
	}
	public UpdateRoleMsg() {
		super();
	}
	
}
