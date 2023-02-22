package com.estf.todo.beans;

import java.util.List;
import java.util.Vector;

public class User {
	
	private String login;
	private String pwd;
	private String name;
	
	
	
	public User() {
		super();
	}
	
	public User(User user) {
		this.login=user.login;
		this.pwd=user.pwd;
		this.name=user.name;
	}
	
	public User(String login, String pwd, String name) {
		super();
		this.login = login;
		this.pwd = pwd;
		this.name = name;
	}


	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
