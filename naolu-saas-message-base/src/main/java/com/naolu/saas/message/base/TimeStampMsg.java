package com.naolu.saas.message.base;

public class TimeStampMsg {
	private Long createDate;
	private Long updateDate;
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	public Long getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Long updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "TimeStampMsg [createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	public TimeStampMsg(Long createDate, Long updateDate) {
		super();
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public TimeStampMsg() {
		super();
	}
	
}
