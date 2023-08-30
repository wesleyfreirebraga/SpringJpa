package com.AulaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AulaJava.curso.Entities.User;
@Repository
public interface UserRepositorie extends JpaRepository<User, Long>{

}
