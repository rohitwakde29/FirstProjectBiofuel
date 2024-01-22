package com.service;

import com.model.User;

public interface UserServiceInterface {

	public User RegisterUser(User user);

	public User FindByEmailid(String emailid);
	
	public User FindByEmailidAndPassword(String emailid,String password);
}
