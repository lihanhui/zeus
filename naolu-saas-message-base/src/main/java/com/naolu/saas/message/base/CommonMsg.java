package com.naolu.saas.message.base;

public class CommonMsg {
	private OwnerIdMsg ownerId;
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

	public CommonMsg(OwnerIdMsg ownerId, StatusMsg status, TimeStampMsg timeStamp) {
		super();
		this.ownerId = ownerId;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		return "CommonMsg [ownerId=" + ownerId + ", status=" + status + ", timeStamp=" + timeStamp + "]";
	}
	public CommonMsg() {
		super();
	}
	
}
