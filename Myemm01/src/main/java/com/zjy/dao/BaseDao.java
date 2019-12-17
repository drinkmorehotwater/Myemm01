package com.zjy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.zjy.api.User;

public class BaseDao {
	public int insert(User user) {
		try {
			// 1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.获得连接
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://59.110.125.155:3306/myblog?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
					"root", "zhoujunyang43");
			// 3.操作数据库
			String sql = "insert into user values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, user.getRowguid());
			preparedStatement.setObject(2, user.getOperateTime());
			preparedStatement.setObject(3, user.getLoginName());
			preparedStatement.setObject(4, user.getPassword());
			preparedStatement.setObject(5, user.getNickName());
			preparedStatement.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return 1;
		}
		return 1;
	}

	public int delete(User user) {
		return 0;
	}

	public User find(String loginName) {
		User user = new User();
		try {
			// 加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 获得连接
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://59.110.125.155:3306/myblog?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
					"root", "zhoujunyang43");
			// 操作数据库
			String sql = "select * from user where loginname=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginName);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				user.setRowguid(rs.getString("rowguid"));
				user.setOperateTime(rs.getDate("operatetime"));
				user.setLoginName(rs.getString("loginname"));
				user.setPassword(rs.getString("password"));
				user.setNickName(rs.getString("nickname"));
				return user;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new User();
	}

	public int update(User user) {
		return 0;
	}
}
