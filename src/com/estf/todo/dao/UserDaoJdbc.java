package com.estf.todo.dao;

import java.util.List;

import com.estf.todo.beans.User;

public class UserDaoJdbc implements UserDao{

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("get all from jdbc");
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
