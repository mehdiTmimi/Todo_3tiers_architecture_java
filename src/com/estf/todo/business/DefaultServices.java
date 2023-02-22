package com.estf.todo.business;

import java.util.List;

import com.estf.todo.beans.User;
import com.estf.todo.dao.UserDao;
import com.estf.todo.dao.UserDaoJdbc;
import com.estf.todo.dao.UserDaoMemory;

public class DefaultServices implements Services{

	//   interfaces dao
	
	private UserDao userDao;
	public DefaultServices() {
		userDao=new UserDaoJdbc();
	}
	@Override
	public User addUser(User user) {
		
		return userDao.save(user);
	}

	@Override
	public User searchUserById(String login) {
		// TODO Auto-generated method stub
		return userDao.findById(login);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
	}

	@Override
	public User deleteUser(User user) {
		// TODO Auto-generated method stub
		return userDao.delete(user);
	}

}
