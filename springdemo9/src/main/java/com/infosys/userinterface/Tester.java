package com.infosys.userinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.configuration.SpringConfigure;
import com.infosys.controller.LoginController;

public class Tester {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigure.class);
        LoginController loginController=context.getBean(LoginController.class);
        loginController.display();                 
	}

}
