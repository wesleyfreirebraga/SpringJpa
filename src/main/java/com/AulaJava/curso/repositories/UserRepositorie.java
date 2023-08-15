package com.AulaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AulaJava.curso.Entities.User;

public interface UserRepositorie extends JpaRepository<User, Long>{

}
