 package com.loginSignup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.loginSignup.model.usersDetails;
import com.loginSignup.service.userService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private userService UserService;
	
	
	
	
@GetMapping("/index")
public String index() {
	 return"index";
}

@GetMapping("/signin")
public String login() {
	 return"login";
}
@GetMapping("/register")
public String register() {
	 return"register";
}

@GetMapping("/base")
public String base() {
	 return"base";
}

@PostMapping("/createUser")
public String createuser(@ModelAttribute usersDetails user,HttpSession session )
{
	//System.out.println(user);
	
boolean f = UserService.checkEmail(user.getEmail());
if(f) {
	session.setAttribute("msg", "Email Already Exist!!");}
else {
	usersDetails userDeatils= UserService.createUser(user);
	if(userDeatils!=null){
		session.setAttribute("msg", "Registration Sucessfully!!");
	}else {
		session.setAttribute("msg", "Something Error in Server!!");
	}
	
}

	
return	"redirect:/register";
}


}





