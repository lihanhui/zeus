package com.naolu.saas.message.system.permission;

import java.util.List;

public class PagedMenuMsg {
	private Long total;
	private Integer pageNumber;
	private Integer pageSize;
	private List<MenuMsg> menus;
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
	public List<MenuMsg> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuMsg> menus) {
		this.menus = menus;
	}
	@Override
	public String toString() {
		return "PagedMenuMsg [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", menus="
				+ menus + "]";
	}
	public PagedMenuMsg(Long total, Integer pageNumber, Integer pageSize, List<MenuMsg> menus) {
		super();
		this.total = total;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.menus = menus;
	}
	public PagedMenuMsg() {
		super();
	}
	
}
