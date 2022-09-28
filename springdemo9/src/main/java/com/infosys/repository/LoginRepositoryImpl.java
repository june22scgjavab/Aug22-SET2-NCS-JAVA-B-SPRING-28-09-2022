package com.infosys.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Override
	public void display() {
		System.out.println("I am login repositoryImpl");

	}

}
