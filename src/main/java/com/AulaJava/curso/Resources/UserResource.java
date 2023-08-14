<<<<<<< HEAD
package com.AulaJava.curso.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AulaJava.curso.Entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
 public ResponseEntity<User> findAll(){
	return null;
	 
 };
}
=======
package com.AulaJava.curso.Resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="users")
public class UserResource {

}
>>>>>>> ba113d3ea4c6d7b624060031323059f89e897a91
