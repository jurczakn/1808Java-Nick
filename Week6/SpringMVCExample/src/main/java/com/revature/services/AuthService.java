package com.revature.services;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.revature.pojo.User;

@Service
public class AuthService {
	
	Logger log = Logger.getLogger(AuthService.class);
	
	public User validate(User user){
		
		User authUser = null;
		log.info("Username passed into validate: " + user.getUsername());
		log.info("Password passed into validate: " + user.getPassword());
		
		if("justuhMatt94".equals(user.getUsername())
				&& "yellowsun".equals(user.getPassword())){
			authUser = user;
			authUser.setId(1);
		}
		
		return authUser;
		
	}

}
