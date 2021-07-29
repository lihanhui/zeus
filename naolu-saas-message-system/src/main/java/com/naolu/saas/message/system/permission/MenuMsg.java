package com.naolu.saas.message.system.permission;

import java.util.List;

import com.naolu.saas.message.base.CommonMsg;
import com.naolu.saas.message.base.OwnerIdMsg;
import com.naolu.saas.message.base.StatusMsg;
import com.naolu.saas.message.base.TimeStampMsg;

public class MenuMsg extends CommonMsg{
	private String menuId;
	private String menuName;
	private String menuCode; // for frontend to match menu
	private String parentMenuCode; // for frontend to match menu
	private List<String> apis;
	
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public List<String> getApis() {
		return apis;
	}
	public void setApis(List<String> apis) {
		this.apis = apis;
	}
	
	public String getParentMenuCode() {
		return parentMenuCode;
	}
	public void setParentMenuCode(String parentMenuCode) {
		this.parentMenuCode = parentMenuCode;
	}
	
	public MenuMsg(OwnerIdMsg ownerId, StatusMsg status, TimeStampMsg timeStamp, String menuId, String menuName,
			String menuCode, String parentMenuCode, List<String> apis) {
		super(ownerId, status, timeStamp);
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuCode = menuCode;
		this.parentMenuCode = parentMenuCode;
		this.apis = apis;
	}
	@Override
	public String toString() {
		return "MenuMsg [menuId=" + menuId + ", menuName=" + menuName + ", menuCode=" + menuCode + ", parentMenuCode="
				+ parentMenuCode + ", apis=" + apis + "]";
	}
	public MenuMsg() {
		super();
	}
}
