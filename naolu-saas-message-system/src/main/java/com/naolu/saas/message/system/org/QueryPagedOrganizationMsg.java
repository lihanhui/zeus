package com.naolu.saas.message.system.org;

import com.naolu.saas.message.base.UserIdMsg;

public class QueryPagedOrganizationMsg {
	private UserIdMsg userId;
	private String orgId;
	private String orgName;
	private String phone;  // 联系人电话
	private String contact;// 联系人
	private String addr;
	private String email;
	private Integer pageNumber;
	private Integer pageSize;
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
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
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "QueryPagedOrganizationMsg [userId=" + userId + ", orgId=" + orgId + ", orgName=" + orgName + ", phone="
				+ phone + ", contact=" + contact + ", addr=" + addr + ", email=" + email + ", pageNumber=" + pageNumber
				+ ", pageSize=" + pageSize + "]";
	}
	public QueryPagedOrganizationMsg(UserIdMsg userId, String orgId, String orgName, String phone, String contact,
			String addr, String email, Integer pageNumber, Integer pageSize) {
		super();
		this.userId = userId;
		this.orgId = orgId;
		this.orgName = orgName;
		this.phone = phone;
		this.contact = contact;
		this.addr = addr;
		this.email = email;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	public QueryPagedOrganizationMsg() {
		super();
	}
}
