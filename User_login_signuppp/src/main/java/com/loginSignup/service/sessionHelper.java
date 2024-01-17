package com.loginSignup.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.*;


import jakarta.servlet.http.HttpSession;
@Component
public class sessionHelper {

	public void removeMessageFromSession() {
		
		try {
			
		HttpSession session =	((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			session.removeAttribute("msg");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
