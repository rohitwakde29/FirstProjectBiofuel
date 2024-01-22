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
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User FindByEmailid(String emailid) {
		// TODO Auto-generated method stub
		return userRepo.findByEmailid(emailid);
	}

	@Override
	public User FindByEmailidAndPassword(String emailid, String password) {
		// TODO Auto-generated method stub
		return userRepo.findByEmailidAndPassword(emailid, password);
	}

}
