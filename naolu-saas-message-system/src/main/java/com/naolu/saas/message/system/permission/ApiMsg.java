package com.naolu.saas.message.system.permission;

public class ApiMsg {
	private String apiId;
	private String apiName;
	private Integer rwMode; // read/1 or write/2
	private String module; // service module
	
	private Long createDate;
	private Long updateDate;
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
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	public Long getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Long updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ApiMsg [apiId=" + apiId + ", apiName=" + apiName + ", rwMode=" + rwMode + ", module=" + module
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	public ApiMsg(String apiId, String apiName, Integer rwMode, String module, Long createDate, Long updateDate) {
		super();
		this.apiId = apiId;
		this.apiName = apiName;
		this.rwMode = rwMode;
		this.module = module;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public ApiMsg() {
		super();
	}
}
