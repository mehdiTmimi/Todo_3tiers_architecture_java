package com.estf.todo.beans;

public class Todo {

	private int id;
	private String title;
	private boolean completed;
	private User user;
	
	
	public Todo() {
		super();
	}
	
	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
