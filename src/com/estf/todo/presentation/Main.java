package com.estf.todo.presentation;

import com.estf.todo.business.DefaultServices;
import com.estf.todo.business.Services;

public class Main {

	private Services services;
	public Main() {
		services=new DefaultServices();
		services.getAllUsers();
	}
	public static void main(String[] args) {

		new Main();
	}

}
