package com.abhishek.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abhishek.app.entities.User;
import com.abhishek.app.repositories.UserRepository;

@SpringBootApplication
public class CrudBackendByAbhishekApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendByAbhishekApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one","one"));
		userRepository.save(new User("two","two"));
		userRepository.save(new User("three","three"));
		
	}
}
