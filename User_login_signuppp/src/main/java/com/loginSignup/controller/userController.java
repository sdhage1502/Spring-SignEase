package com.loginSignup.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginSignup.model.usersDetails;
import com.loginSignup.repository.UserRepo;


@Controller
@RequestMapping("/user/")
public class userController {
	@Autowired
	private UserRepo userRepo;
	
	@ModelAttribute
	private void userDetails(Principal p,Model m) {
		
		String email=p.getName();
		usersDetails user = userRepo.findByEmail(email);
		m.addAttribute("user",user);
	}
	
	@GetMapping("/")
public String home() {
	return "user/home";
}
}
