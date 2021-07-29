package com.naolu.saas.message.system.org;

import com.naolu.saas.message.base.OwnerIdMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.TimeStampMsg;

public class OrganizationMsg {
	private OwnerIdMsg ownerId;
	private String orgId;
	private String orgName;
	private String phone;  // 联系人电话
	private String contact;// 联系人
	private String addr;
	private String email;
	private String busiLicense; // 营业执照
	
	private Long verifyDate;
	
	private StatusMsg status;
	private TimeStampMsg timeStamp;
	public OwnerIdMsg getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(OwnerIdMsg ownerId) {
		this.ownerId = ownerId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBusiLicense() {
		return busiLicense;
	}
	public void setBusiLicense(String busiLicense) {
		this.busiLicense = busiLicense;
	}
	public Long getVerifyDate() {
		return verifyDate;
	}
	public void setVerifyDate(Long verifyDate) {
		this.verifyDate = verifyDate;
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
	@Override
	public String toString() {
		return "OrganizationMsg [ownerId=" + ownerId + ", orgId=" + orgId + ", orgName=" + orgName + ", phone=" + phone
				+ ", contact=" + contact + ", addr=" + addr + ", email=" + email + ", busiLicense=" + busiLicense
				+ ", verifyDate=" + verifyDate + ", status=" + status + ", timeStamp=" + timeStamp + "]";
	}
	public OrganizationMsg(OwnerIdMsg ownerId, String orgId, String orgName, String phone, String contact, String addr,
			String email, String busiLicense, Long verifyDate, StatusMsg status, TimeStampMsg timeStamp) {
		super();
		this.ownerId = ownerId;
		this.orgId = orgId;
		this.orgName = orgName;
		this.phone = phone;
		this.contact = contact;
		this.addr = addr;
		this.email = email;
		this.busiLicense = busiLicense;
		this.verifyDate = verifyDate;
		this.status = status;
		this.timeStamp = timeStamp;
	}
	public OrganizationMsg() {
		super();
	}
	
}
