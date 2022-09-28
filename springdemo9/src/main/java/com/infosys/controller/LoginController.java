package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infosys.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	  public void display() {
		  System.out.println("LoginController is called");
		  loginService.display();
		  
	  }
}
