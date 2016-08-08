package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/admin/getAllUsers" }, method = RequestMethod.GET)
	public List<User> welcome() {
		return userService.getAllUser();
	}

	@RequestMapping(value = "/admin/addUser", method = RequestMethod.POST)
	public boolean addUser(@RequestBody User user) {
		userService.add(user);
		return true;
	}

	@RequestMapping(value = "/admin/updateUser/{id}", method = RequestMethod.PUT)
	public boolean updateUser(@PathVariable("id") long id, @RequestBody User user) {
		userService.edit(user);
		return true;
	}

	@RequestMapping(value = "/admin/deleteUserByUserName/{id}", method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable("id") String id) {
		User user = userService.getUser(id);
		if (user == null) {
			System.out.println("Unable to delete. User with id " + id + " not found");
			return false;
		}
		userService.delete(user.getId());
		return true;
	}

}