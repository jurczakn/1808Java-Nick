package com.revature.services;

import com.revature.beans.User;

public class UserService {
	
	public User validateUser(User u){
		
		if("nick".equals(u.getUsername()) && "1234".equals(u.getPassword())){
			u.setRole("employee");
			return u;
		}
		else if("james".equals(u.getUsername()) && "4321".equals(u.getPassword())){
			u.setRole("manager");
			return u;
		}
		return null;
	}

}
