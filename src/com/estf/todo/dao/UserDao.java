package com.estf.todo.dao;

import java.util.List;

import com.estf.todo.beans.User;

public interface UserDao {

	User save(User user);
	User findById(String login);
	List<User> getAll();
	User update(User user);
	User delete(User user);
}
