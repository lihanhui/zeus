package com.naolu.saas.message.system.org;

import com.naolu.saas.message.base.OwnerIdMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.TimeStampMsg;

public class DepartmentMsg {
	private OwnerIdMsg ownerId;
	private String deptId;
	private String deptName;
	private String orgId;
	private StatusMsg status;
	private TimeStampMsg timeStamp;
	public OwnerIdMsg getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(OwnerIdMsg ownerId) {
		this.ownerId = ownerId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public StatusMsg getStatus() {
		return status;
	}
	public void setStatus(StatusMsg status) {
		this.status = status;
	}
	public TimeStampMsg getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(TimeStampMsg timeStamp) {
		this.timeStamp = timeStamp;
	}
	public DepartmentMsg(OwnerIdMsg ownerId, String deptId, String deptName, String orgId, StatusMsg status,
			TimeStampMsg timeStamp) {
		super();
		this.ownerId = ownerId;
		this.deptId = deptId;
		this.deptName = deptName;
		this.orgId = orgId;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "DepartmentMsg [ownerId=" + ownerId + ", deptId=" + deptId + ", deptName=" + deptName + ", orgId="
				+ orgId + ", status=" + status + ", timeStamp=" + timeStamp + "]";
	}
	public DepartmentMsg() {
		super();
	}
	
}
