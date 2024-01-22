package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserServiceInterface;

@RestController

@RequestMapping("/adminLogin")
public class UserController {
	@Autowired
	UserServiceInterface userServ;
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")

	public User RegisterUser(@RequestBody User user) throws Exception {
		
		String Temp=user.getEmailid();
		if(Temp!=null && !"" .equals(Temp))
		{
			User obj=userServ.FindByEmailid(Temp);
			
			if(obj!=null)
			{
				throw new Exception("User with " +Temp+ "already exists ");
			}
		}
		return userServ.RegisterUser(user);
		
		
	
	
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	
	public User FindByEmailidAndPassword(@RequestBody User user) throws Exception {
	
		String TempEmail=user.getEmailid();
		String TempPass=user.getPassword();
		
		User userobj=null;
		if(TempEmail!=null && TempPass!=null)
		{
			userobj=userServ.FindByEmailidAndPassword(TempEmail, TempPass);
			
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	
}
