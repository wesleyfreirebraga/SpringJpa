package com.AulaJava.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AulaJava.curso.Entities.User;
import com.AulaJava.curso.repositories.UserRepositorie;
@Service
public class UserService {
@Autowired
private  UserRepositorie repository;
public List<User> findAll(){
	return repository.findAll();
}
public User findByID(Long Id) {
 Optional<User>obj= repository.findById(Id);
	return obj.get();
}
}
