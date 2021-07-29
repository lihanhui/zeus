package com.naolu.saas.message.system.org;

import com.naolu.saas.message.base.UserIdMsg;

public class SubmitOrganizationMsg {
	private UserIdMsg userId;
	private String orgName;
	private String phone;  // 联系人电话
	private String contact;// 联系人
	private String addr;
	private String email;
	private String busiLicense; // 营业执照,应该是对应一个url，表示上传后的营业执照照片
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
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
	public SubmitOrganizationMsg(UserIdMsg userId, String orgName, String phone, String contact, String addr,
			String email, String busiLicense) {
		super();
		this.userId = userId;
		this.orgName = orgName;
		this.phone = phone;
		this.contact = contact;
		this.addr = addr;
		this.email = email;
		this.busiLicense = busiLicense;
	}
	public SubmitOrganizationMsg() {
		super();
	}
}
