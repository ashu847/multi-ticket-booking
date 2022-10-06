package com.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Login;
import com.demo.entity.User;
import com.demo.service.UserServiceDTO;

@RestController
public class UserMicroserviceRestController {
	
	@Autowired
	UserServiceDTO usd;
	
	@PostMapping(value="/useradd")
	public ResponseEntity<String> addUser(@RequestBody User user){
		String res=usd.addUser(user);
		return ResponseEntity.ok(res);
		
		
	}
	
	@PostMapping(value="/loginadd")
	public ResponseEntity<String> addLoginUser( @RequestBody Login login){
		String res=usd.addLoginUser(login);
		return ResponseEntity.ok(res);
		
		
	}
	
	@PostMapping(value="/userlogin", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> validateUser(@RequestBody Login login) {
		boolean res= usd.validCredential(login);
		if(res==true) {
			return ResponseEntity.ok("Logged in");
		}
		else {
			return ResponseEntity.ok("{\"status\":\"Invalid user\"}");
		}
		
	}
	
	@GetMapping(value="/userfind/{userId}")
	public ResponseEntity<User> findUser(@PathVariable("userId") String userId){
		User user= usd.findUser(userId);
		return ResponseEntity.ok(user);
	}

}
