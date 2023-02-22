package com.estf.todo.business;

import java.util.List;

import com.estf.todo.beans.User;

public interface Services {

	//gestion des users
	User addUser(User user);
	User searchUserById(String login);
	List<User> getAllUsers();
	User updateUser(User user);
	User deleteUser(User user);
	
}
