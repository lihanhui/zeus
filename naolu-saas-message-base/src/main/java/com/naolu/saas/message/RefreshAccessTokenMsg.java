package com.naolu.saas.message;

public class RefreshAccessTokenMsg {
	private String refreshToken;
	private String accessToken;
	private String uuid;
	private String userId;
	private String imei;
	private String productId;
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public RefreshAccessTokenMsg(String refreshToken, String accessToken, String uuid, String userId, String imei,
			String productId) {
		super();
		this.refreshToken = refreshToken;
		this.accessToken = accessToken;
		this.uuid = uuid;
		this.userId = userId;
		this.imei = imei;
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "RefreshAccessTokenMsg [refreshToken=" + refreshToken + ", accessToken=" + accessToken + ", uuid=" + uuid
				+ ", userId=" + userId + ", imei=" + imei + ", productId=" + productId + "]";
	}
	public RefreshAccessTokenMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}