package com.naolu.saas.message.user;

import com.naolu.saas.message.base.CommonMsg;
import com.naolu.saas.message.base.OwnerIdMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.TimeStampMsg;

public class UserMsg extends CommonMsg{
	private String userId;
	private String phone;
	private String name;
	private Integer gender;
	private Integer age;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public UserMsg(OwnerIdMsg ownerId, StatusMsg status, TimeStampMsg timeStamp, String userId, String phone,
			String name, Integer gender, Integer age) {
		super(ownerId, status, timeStamp);
		this.userId = userId;
		this.phone = phone;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserMsg [userId=" + userId + ", phone=" + phone + ", name=" + name + ", gender=" + gender + ", age="
				+ age + "]";
	}
	public UserMsg() {
		super();
	}
	public UserMsg(OwnerIdMsg ownerId, StatusMsg status, TimeStampMsg timeStamp) {
		super(ownerId, status, timeStamp);
	}
}
