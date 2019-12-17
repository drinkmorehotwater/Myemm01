package com.zjy.service;

import com.zjy.api.User;
import com.zjy.dao.BaseDao;

public class LoginService {
	public User find(String loginName) {
		return new BaseDao().find(loginName);
	}

	public void insert(User user) {
		new BaseDao().insert(user);
	}
}
