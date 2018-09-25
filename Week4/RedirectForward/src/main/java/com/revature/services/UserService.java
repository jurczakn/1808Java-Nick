package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.User;

public class UserService {
	
	private static List<User> userDao = new ArrayList<User>();
	
	public User validateUser(User u){
		User actualUser = getUser(u.getUsername());
		if (actualUser == null){
			return null;
		}
		if (actualUser.getPassword().equals(u.getPassword())){
			return actualUser;
		}
		return null;
	}
	
	public void addUser(User u){
		userDao.add(u);
	}
	
	public User getUser(String username){
		for(User u : userDao){
			if(u.getUsername().equals(username)){
				return u;
			}
		}
		return null;
	}
	
	public void removeUser(User u){
		for(int i = 0; i < userDao.size(); i++){
			if(userDao.get(i).getUsername().equals(u.getUsername())){
				userDao.remove(i);
				return;
			}
		}
	}
	
	public UserService(){
		userDao.add(new User("nick", "1234", "employee"));
		userDao.add(new User("james", "4321", "manager"));
	}

}
