package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.component.HelloWorld;
import com.example.demo.component.HelloWorld;
import org.springframework.core.env.Environment;
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private HelloWorld world;
   
	
	@Autowired
	private Environment env;
	
	public static void main(String[] args) {
 
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("My spring boot application is up");
	}

	@Override
	public void run(String... args) throws Exception {
	  greet();
	  hello();
		
	}

	private void hello() {
		System.out.println("I am the hello method");
		
	}

	private void greet() {
    world.display();
    System.out.println(env.getProperty("name"));
		
	}

}
