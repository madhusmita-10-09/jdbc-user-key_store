package com.ty.user.keystore.service;

import com.ty.user.keystore.dao.UserDao;
import com.ty.user.keystore.dto.User;

public class UserService {
	UserDao userDao=new UserDao();
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}
}
