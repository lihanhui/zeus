package com.naolu.message.upload;

public class GetTokenMsg {
	private String userId;
	private String productId;
	
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
	@Override
	public String toString() {
		return "GetStsTokenMsg [userId=" + userId + ", productId=" + productId + "]";
	}
	public GetTokenMsg() {
		super();
	}
}
