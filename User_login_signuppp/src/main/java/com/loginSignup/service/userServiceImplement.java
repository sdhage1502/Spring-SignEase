package com.loginSignup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.loginSignup.model.usersDetails;
import com.loginSignup.repository.UserRepo;
@Service

public class userServiceImplement implements userService {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

    @Override
	public usersDetails createUser(usersDetails user) {

    	
  user.setPassword(passwordEncode.encode(user.getPassword()));
  user.setRole("ROLE_USER");
    	return  userrepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		return userrepo.existsByEmail(email);
	}

}
