package com.naolu.saas.message.base;

public class ReqBaseMsg {
	private UserIdMsg userId;
	private AuditStatusMsg auditStatus;
	private StatusMsg status;
	
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public AuditStatusMsg getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(AuditStatusMsg auditStatus) {
		this.auditStatus = auditStatus;
	}
	public StatusMsg getStatus() {
		return status;
	}
	public void setStatus(StatusMsg status) {
		this.status = status;
	}
	
	public ReqBaseMsg(UserIdMsg userId, AuditStatusMsg auditStatus, StatusMsg status) {
		super();
		this.userId = userId;
		this.auditStatus = auditStatus;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ReqBaseMsg [userId=" + userId + ", auditStatus=" + auditStatus + ", status=" + status + "]";
	}
	public ReqBaseMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
}
