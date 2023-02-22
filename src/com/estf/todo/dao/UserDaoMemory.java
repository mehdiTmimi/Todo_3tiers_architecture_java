package com.estf.todo.dao;

import java.util.List;
import java.util.Vector;

import com.estf.todo.beans.User;

public class UserDaoMemory implements UserDao{

	private List<User> users;
	
	public UserDaoMemory() {
		users=new Vector<User>();
	}
	
	@Override
	public User save(User user) {
		
		User u=findById(user.getLogin());
		if(u!=null)
			return null;
		users.add(user);
		return new User(user);
	}

	@Override
	public User findById(String login) {
		for(User u:users) {
			if(u.getLogin().equals(login))
				return u;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		System.out.println("get all from memory");
		return users;
	}

	@Override
	public User update(User user) {
		User u=findById(user.getLogin());
		if(u==null)
			return null;
		
		u.setName(user.getName());
		u.setPwd(user.getPwd());
		return u;
	}

	@Override
	public User delete(User user) {
		User u=findById(user.getLogin());
		if(u==null)
			return null;
		users.remove(u);
		return u;
		}

	
}
