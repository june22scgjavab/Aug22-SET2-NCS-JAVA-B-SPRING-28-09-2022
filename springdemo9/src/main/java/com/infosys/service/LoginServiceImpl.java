package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	// private LoginRepository loginRepository=new LoginRepositoryImpl();
	
	@Override
	public void display() {
		System.out.println("I am the LoginServiceImpl");
		loginRepository.display();

	}

}
