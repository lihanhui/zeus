package com.naolu.saas.message.base;

public class ResBaseMsg {
	private OwnerIdMsg ownerId;
	private AuditStatusMsg auditStatus;
	private StatusMsg status;
	private TimeStampMsg timeStamp;
	public OwnerIdMsg getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(OwnerIdMsg ownerId) {
		this.ownerId = ownerId;
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

	public AuditStatusMsg getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(AuditStatusMsg auditStatus) {
		this.auditStatus = auditStatus;
	}
	
	public ResBaseMsg(OwnerIdMsg ownerId, AuditStatusMsg auditStatus, StatusMsg status, TimeStampMsg timeStamp) {
		super();
		this.ownerId = ownerId;
		this.auditStatus = auditStatus;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "ResBaseMsg [ownerId=" + ownerId + ", auditStatus=" + auditStatus + ", status=" + status + ", timeStamp="
				+ timeStamp + "]";
	}
	public ResBaseMsg() {
		super();
	}
	
}
