package com.zjy.api;

import java.util.Date;

public class User {
	/**
	 * 主键
	 */
	private String rowguid;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 操作日期
	 */
	private Date operateTime;
	public String getRowguid() {
		return rowguid;
	}
	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	
}
