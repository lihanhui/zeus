package com.naolu.saas.message.base;

public class TokenMsg {
	private String accessToken;
	private String userId;
	private String signAlgorithm;
	private String refreshToken;
	private Long expireDate;
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSignAlgorithm() {
		return signAlgorithm;
	}
	public void setSignAlgorithm(String signAlgorithm) {
		this.signAlgorithm = signAlgorithm;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public Long getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Long expireDate) {
		this.expireDate = expireDate;
	}
	@Override
	public String toString() {
		return "TokenMessage [accessToken=" + accessToken + ", userId=" + userId   
				+ ", signAlgorithm=" + signAlgorithm + ", refreshToken=" + refreshToken + ", expireDate=" + expireDate
				+ "]";
	}
	public TokenMsg(String accessToken, String userId, String signAlgorithm,
			String refreshToken, Long expireDate) {
		super();
		this.accessToken = accessToken;
		this.userId = userId;
		this.signAlgorithm = signAlgorithm;
		this.refreshToken = refreshToken;
		this.expireDate = expireDate;
	}
	public TokenMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
