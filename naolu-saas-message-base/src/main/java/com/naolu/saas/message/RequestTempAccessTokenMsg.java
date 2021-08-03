package com.naolu.saas.message;

public class RequestTempAccessTokenMsg {
	private String uuid;
	private String productId;
	private String imei;
	private String os;
	private Long timestamp;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public RequestTempAccessTokenMsg(String uuid, String productId, String imei, String os, Long timestamp) {
		super();
		this.uuid = uuid;
		this.productId = productId;
		this.imei = imei;
		this.os = os;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "RequestTempAccessTokenMsg [uuid=" + uuid + ", productId=" + productId + ", imei=" + imei + ", os=" + os
				+ ", timestamp=" + timestamp + "]";
	}
	public RequestTempAccessTokenMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
