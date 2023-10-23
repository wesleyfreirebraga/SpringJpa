package com.AulaJava.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.AulaJava.curso.Entities.Category;
import com.AulaJava.curso.Entities.User;
import com.AulaJava.curso.repositories.CategoryRepositorie;
import com.AulaJava.curso.repositories.UserRepositorie;

@Configuration
@Profile("test")
public class testeConfig implements CommandLineRunner{
	@Autowired
private UserRepositorie userRepository;

	@Autowired
	private CategoryRepositorie categoryRepositorie;
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null,"eletronico");
		Category cat2 = new Category(null,"livros");
		Category cat3 = new Category(null,"jogos");
		categoryRepositorie.saveAll(Arrays.asList(cat1,cat2,cat3));
	
		
		User u1 = new User( 0, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(1, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
