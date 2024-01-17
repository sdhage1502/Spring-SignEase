package com.loginSignup.service;

import com.loginSignup.model.usersDetails;

public interface userService {

	
	
	public usersDetails createUser(usersDetails user);
		public boolean checkEmail(String email);
}
 