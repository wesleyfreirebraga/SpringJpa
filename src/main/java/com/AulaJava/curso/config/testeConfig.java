package com.AulaJava.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.AulaJava.curso.Entities.User;
import com.AulaJava.curso.repositories.UserRepositorie;

@Configuration
@Profile("test")
public class testeConfig implements CommandLineRunner{
	@Autowired
private UserRepositorie userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User( 0, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(1, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
