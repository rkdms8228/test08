package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	//로그인폼
	@GetMapping("/loginForm")
	public String loginForm() {
		
		return "/user/loginForm";
		
	}

}
