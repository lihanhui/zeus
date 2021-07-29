package com.naolu.saas.message.base;

public class DummyQueryBaseMsg {
    private Integer pageNumber;
    private Integer pageSize;
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
		return "DummyQueryBaseMsg [pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
	}
	public DummyQueryBaseMsg(Integer pageNumber, Integer pageSize) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	public DummyQueryBaseMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
