package com.zjy.service;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;

import com.zjy.api.User;
import com.zjy.dao.BaseDao;
public class LoginService {
	public boolean validate(User user) {
		return false;
		
	}
	@Test
	public void addUser() {
		User user=new User();
		user.setRowguid(UUID.randomUUID().toString());
		user.setLoginName("zhoujunyang");
		user.setOperateTime(new Date());
		user.setPassword("123445");
		user.setNickName("三尺微命");
		new BaseDao().insert(user);
	}
}
