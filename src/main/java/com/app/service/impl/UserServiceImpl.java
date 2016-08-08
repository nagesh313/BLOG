package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDao;
import com.app.dao.UserDao;
import com.app.model.User;
import com.app.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void add(User user) {
		userDao.addUser(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void edit(User user) {
		// TODO Auto-generated method stub
		userDao.editUser(user);
		
	}

	@Override
	@Transactional
	public void delete(int userId) {
		// TODO Auto-generated method stub
		userDao.deleteUser(userId);
	}

	@Override
	@Transactional
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(userId);
	}

	@Override
	@Transactional
	public List getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

}
