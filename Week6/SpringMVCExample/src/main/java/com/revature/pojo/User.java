package com.revature.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@NotNull(message="please enter a username")
	@Size(min= 9, max=200, message="Username must be between 9 and 200 characters")
	private String username;
	
	@NotNull(message="please enter a password")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

}
