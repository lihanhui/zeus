package com.naolu.message.usercenter;

public class FindOrCreateUserMsg {
	private String productId;
	private String phone;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public FindOrCreateUserMsg(String productId, String phone) {
		super();
		this.productId = productId;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "FindOrCreateUserMsg [productId=" + productId + ", phone=" + phone + "]";
	}
	public FindOrCreateUserMsg() {
		super();
	}
}
