package com.naolu.saas.message.system.role;

import java.util.List;

import com.naolu.saas.message.base.CommonMsg;
import com.naolu.saas.message.base.OwnerIdMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.TimeStampMsg;

public class RoleMsg2 extends CommonMsg{
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
	public RoleMsg2(OwnerIdMsg ownerId, StatusMsg status, TimeStampMsg timeStamp, String roleId, String name,
			String note, List<String> menuIds) {
		super(ownerId, status, timeStamp);
		this.roleId = roleId;
		this.name = name;
		this.note = note;
		this.menuIds = menuIds;
	}
	@Override
	public String toString() {
		return "RoleMsg2 [roleId=" + roleId + ", name=" + name + ", note=" + note + ", menuIds=" + menuIds + "]";
	}
	public RoleMsg2() {
		super();
	}
	
}
