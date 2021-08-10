package com.naolu.saas.message.user;

import com.naolu.saas.message.base.AuditStatusMsg;
import com.naolu.saas.message.base.ReqBaseMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.UserIdMsg;

public class UpdateUserMsg extends ReqBaseMsg{
	private String herUserId;
	private String phone;
	private String name;
	private Integer gender;
	private Integer age;
	
	public String getHerUserId() {
		return herUserId;
	}
	public void setHerUserId(String herUserId) {
		this.herUserId = herUserId;
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
	public UpdateUserMsg(UserIdMsg userId, AuditStatusMsg auditStatus, StatusMsg status, String herUserId, String phone,
			String name, Integer gender, Integer age) {
		super(userId, auditStatus, status);
		this.herUserId = herUserId;
		this.phone = phone;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserMsg [herUserId=" + herUserId + ", phone=" + phone + ", name=" + name + ", gender=" + gender + ", age="
				+ age + "]";
	}
	public UpdateUserMsg() {
		super();
	}
}
