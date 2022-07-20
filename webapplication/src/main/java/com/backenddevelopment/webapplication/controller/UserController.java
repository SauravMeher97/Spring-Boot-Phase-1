package com.backenddevelopment.webapplication.controller;
import com.backenddevelopment.webapplication.entities.user;
import com.backenddevelopment.webapplication.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
	@Autowired
	UserService userservice;
	
	private final String LOGIN="login";
	private final String USER_VIEW="user";
	private final String New_user="new_user";
	
	@Value("${message}")
	public String message;
	
	
	@GetMapping("/hello")
	public String hello() {
		return message;
	}
	
	@GetMapping("/")
	public String loginpage() {
		return LOGIN;
	}
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String user(@Validated user user,Model model) {
		//System.out.println("UserName "+user.getUserName());
		
		user userfound = userservice.getUser(user.getUserName());
		
		System.out.println("userfound");
		
		if(userfound==null) {
			return New_user;
		}
		
		else {
			model.addAttribute("user", userfound);
			return USER_VIEW;
		}
	}

}
