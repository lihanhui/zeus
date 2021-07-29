package com.naolu.saas.message.system.org;

import java.util.List;

public class PagedOrganizationMsg {
	private Long total;
	private Integer pageNumber;
	private Integer pageSize;
	private List<OrganizationMsg> orgs;
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
	public List<OrganizationMsg> getOrgs() {
		return orgs;
	}
	public void setOrgs(List<OrganizationMsg> orgs) {
		this.orgs = orgs;
	}
	@Override
	public String toString() {
		return "PagedOrganizationMsg [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize
				+ ", orgs=" + orgs + "]";
	}
	public PagedOrganizationMsg(Long total, Integer pageNumber, Integer pageSize, List<OrganizationMsg> orgs) {
		super();
		this.total = total;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.orgs = orgs;
	}
	public PagedOrganizationMsg() {
		super();
	}
}
