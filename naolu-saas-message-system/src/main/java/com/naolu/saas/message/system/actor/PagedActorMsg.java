package com.naolu.saas.message.system.actor;

import java.util.List;

public class PagedActorMsg {
	private Long total;
	private Integer pageNumber;
	private Integer pageSize;
	private List<ActorMsg> actors;
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
	
	public List<ActorMsg> getActors() {
		return actors;
	}
	public void setActors(List<ActorMsg> actors) {
		this.actors = actors;
	}
	public PagedActorMsg(Long total, Integer pageNumber, Integer pageSize, List<ActorMsg> actors) {
		super();
		this.total = total;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.actors = actors;
	}
	@Override
	public String toString() {
		return "PagedActorMsg [total=" + total + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", actors="
				+ actors + "]";
	}
	public PagedActorMsg() {
		super();
	}
	
}
