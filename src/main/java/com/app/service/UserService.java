package com.app.service;

import java.util.List;

import com.app.model.User;

public interface UserService {
	public void add(User user);
	public void edit(User user);
	public void delete(int userId);
	public User getUser(String userId);
	public List getAllUser();
}
