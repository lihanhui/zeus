package com.naolu.message.usercenter;

public class UserMsg {
	private Long userId;
	private String phone;
	private String productId;
	private Long createDate;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	public UserMsg(Long userId, String phone, String productId, Long createDate) {
		super();
		this.userId = userId;
		this.phone = phone;
		this.productId = productId;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "UserMsg [userId=" + userId + ", phone=" + phone + ", productId=" + productId + ", createDate="
				+ createDate + "]";
	}
	public UserMsg() {
		super();
	}

}
