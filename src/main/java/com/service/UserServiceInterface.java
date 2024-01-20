package com.service;

import com.model.User;

public interface UserServiceInterface {

	public User RegisterUser(User user);

	public User FindByEmailid(String emailId);
	
	public User FindByEmailidAndPassword(String emailId,String password);
}
