package com.demo.service;

import com.demo.entity.Login;
import com.demo.entity.User;

public interface UserServiceDTO {
	
	public String addUser(User user);
	
	public String addLoginUser(Login login);
	
	public boolean validCredential(Login login);
	
	public User findUser(String userId);

}
