package com.naolu.saas.message.system.permission;

import com.naolu.saas.message.base.UserIdMsg;

public class QueryPagedApiMsg {
	private UserIdMsg userId;
	private String apiId;
	private String apiName;
	private Integer rwMode; 	// read/1 or write/2
	private String module; 		// service module
	private Integer pageNumber;
	private Integer pageSize;
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public Integer getRwMode() {
		return rwMode;
	}
	public void setRwMode(Integer rwMode) {
		this.rwMode = rwMode;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
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
	public UserIdMsg getUserId() {
		return userId;
	}
	public void setUserId(UserIdMsg userId) {
		this.userId = userId;
	}
	public QueryPagedApiMsg(UserIdMsg userId, String apiId, String apiName, Integer rwMode, String module,
			Integer pageNumber, Integer pageSize) {
		super();
		this.userId = userId;
		this.apiId = apiId;
		this.apiName = apiName;
		this.rwMode = rwMode;
		this.module = module;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "QueryPagedApiMsg [userId=" + userId + ", apiId=" + apiId + ", apiName=" + apiName + ", rwMode=" + rwMode
				+ ", module=" + module + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
	}
	public QueryPagedApiMsg() {
		super();
	}
}
