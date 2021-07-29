package com.naolu.saas.message.system.actor;

public class LoginMsg {
	private String mobile;
	private String password;
	private String uuid;
	private String imei;
	private String os;
	private String productId;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "LoginMsg [mobile=" + mobile + ", password=" + password + ", uuid=" + uuid + ", imei=" + imei + ", os="
				+ os + ", productId=" + productId + "]";
	}
	public LoginMsg(String mobile, String password, String uuid, String imei, String os, String productId) {
		super();
		this.mobile = mobile;
		this.password = password;
		this.uuid = uuid;
		this.imei = imei;
		this.os = os;
		this.productId = productId;
	}
	public LoginMsg() {
		super();
	}
	
}
