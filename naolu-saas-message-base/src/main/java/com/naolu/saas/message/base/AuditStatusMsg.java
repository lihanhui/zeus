package com.naolu.saas.message.base;

public class AuditStatusMsg {
	private Long auditDate;
	private String auditNote;
	private Integer status; // 1 未审核； 2： 通过； 3：不通过
	public Long getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Long auditDate) {
		this.auditDate = auditDate;
	}
	public String getAuditNote() {
		return auditNote;
	}
	public void setAuditNote(String auditNote) {
		this.auditNote = auditNote;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AuditStatusMsg [auditDate=" + auditDate + ", auditNote=" + auditNote + ", status=" + status + "]";
	}
	public AuditStatusMsg(Long auditDate, String auditNote, Integer status) {
		super();
		this.auditDate = auditDate;
		this.auditNote = auditNote;
		this.status = status;
	}
	public AuditStatusMsg() {
		super();
	}
	
}
