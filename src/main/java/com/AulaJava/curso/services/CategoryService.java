package com.AulaJava.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AulaJava.curso.Entities.Category;
import com.AulaJava.curso.Entities.User;
import com.AulaJava.curso.repositories.CategoryRepositorie;
@Service
public class CategoryService {
@Autowired
private  CategoryRepositorie repository;
public List<Category> findAll(){
	return repository.findAll();
}
public Category findByID(Long Id) {
 Optional<Category>obj= repository.findById(Id);
	return obj.get();
}
}
