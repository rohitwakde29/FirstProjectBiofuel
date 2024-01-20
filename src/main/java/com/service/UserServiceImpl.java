package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl  implements UserServiceInterface{
	
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public User RegisterUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User FindByEmailid(String emailId) {
		
		return userRepo.findByEmailId(emailId);
	}

	@Override
	public User FindByEmailidAndPassword(String emailId, String password) {
		
		return userRepo.findByEmailIdAndPassword(emailId, password);
	}


}
