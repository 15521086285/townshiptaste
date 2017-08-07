package com.pc.homenews.serviceImpl;

import org.springframework.stereotype.Service;

import com.pc.homenews.dao.UserDao;
import com.pc.homenews.entity.User;
import com.pc.homenews.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public User getUser() {
		return userDao.getUser();
	}

}
