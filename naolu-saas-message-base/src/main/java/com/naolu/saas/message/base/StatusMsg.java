package com.naolu.saas.message.base;

public class StatusMsg {
	private Boolean enabled;
	private Long beginDate;
	private Long expireDate;
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Long getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Long beginDate) {
		this.beginDate = beginDate;
	}
	public Long getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Long expireDate) {
		this.expireDate = expireDate;
	}
	@Override
	public String toString() {
		return "StatusMsg [enabled=" + enabled + ", beginDate=" + beginDate + ", expireDate=" + expireDate + "]";
	}
	public StatusMsg(Boolean enabled, Long beginDate, Long expireDate) {
		super();
		this.enabled = enabled;
		this.beginDate = beginDate;
		this.expireDate = expireDate;
	}
	public StatusMsg() {
		super();
	}
	
}
