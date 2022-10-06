package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LoginRepo;
import com.demo.UserRepo;
import com.demo.entity.Login;
import com.demo.entity.User;

@Service
public class UserService implements UserServiceDTO {
	
	@Autowired
	LoginRepo logRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public String addLoginUser(Login login) {
		Optional<Login> log=  logRepo.findById(login.getUsername());
		
		if(log.isPresent()) {
			return "User Already Exist";
		}
		else {
			logRepo.save(login);
			return "User Saved";
		}
		
	}
	
	@Override
	public String addUser(User user) {
Optional<User> u=  userRepo.findById(user.getMobileno());
		
		if(u.isPresent()) {
			return "User Already Exist";
		}
		else {
			userRepo.save(user);
			return "User Saved";
		}
	}
	
	public boolean validCredential(Login login) {
		Optional<Login> user = logRepo.findById(login.getUsername());
		
		if(user.isPresent()) {
			if(user.get().getPassword().equals(login.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
		
	}
	
	public User findUser(String userId) {
		Optional<User> user= userRepo.findById(userId);
		return user.get();
	}

}
