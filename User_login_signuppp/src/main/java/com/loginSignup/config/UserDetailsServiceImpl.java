package com.loginSignup.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.loginSignup.model.usersDetails;
import com.loginSignup.repository.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
@Autowired
	private UserRepo  userRepo;


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		
		usersDetails user = userRepo.findByEmail(email);
		if(user!=null) {
			return new CustomUserDetails(user);
		}

		
	
	
	throw new UsernameNotFoundException("user not Avaliable");

}
}
