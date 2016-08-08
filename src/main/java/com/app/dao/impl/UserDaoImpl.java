package com.app.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.dao.UserDao;
import com.app.model.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	@Override
	public void addUser(User user) {
		getSession().save(user);
	}

	@Override
	public void editUser(User user) {
		getSession().update(user);
	}

	@Override
	public void deleteUser(int userId) {
		getSession().delete(findUser(userId));
	}

	@Override
	public User findUser(int userId) {
		return (User) getSession().get(User.class, userId);
	}

	@Override
	public User findUserByName(String username) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));		
		return (User) criteria.uniqueResult();
	}

	@Override
	public List<User> getAllUsers() {
		return getSession().createQuery("from User").list();
	}

}
