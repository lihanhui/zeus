package com.naolu.saas.message.system.role;

import java.util.List;

public class PagedRoleMsg {
	private Long total;
	private Integer pageNumber;
	private Integer pageSize;
	private List<RoleMsg> roles;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
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
	public List<RoleMsg> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleMsg> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "PagedRoleMsg [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", roles="
				+ roles + "]";
	}
	public PagedRoleMsg(Long total, Integer pageNumber, Integer pageSize, List<RoleMsg> roles) {
		super();
		this.total = total;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.roles = roles;
	}
	public PagedRoleMsg() {
		super();
	}
	
}
