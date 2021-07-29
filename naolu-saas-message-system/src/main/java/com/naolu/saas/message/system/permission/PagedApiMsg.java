package com.naolu.saas.message.system.permission;

import java.util.List;

public class PagedApiMsg {
	private Long total;
	private Integer pageNumber;
	private Integer pageSize;
	private List<ApiMsg> apis;
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
	public List<ApiMsg> getApis() {
		return apis;
	}
	public void setApis(List<ApiMsg> apis) {
		this.apis = apis;
	}
	@Override
	public String toString() {
		return "PagedApiMsg [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", apis="
				+ apis + "]";
	}
	public PagedApiMsg(Long total, Integer pageNumber, Integer pageSize, List<ApiMsg> apis) {
		super();
		this.total = total;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.apis = apis;
	}
	public PagedApiMsg() {
		super();
	}
}
