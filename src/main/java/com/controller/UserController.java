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
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/adminLogin")
public class UserController {
	
	@Autowired
	UserServiceInterface userService;
	
public User RegisterUser(@RequestBody User user) throws Exception {
		
		String Temp=user.getEmailId();
		if(Temp!=null && !"" .equals(Temp))
		{
			User obj=userService.FindByEmailid(Temp);
			
			if(obj!=null)
			{
				throw new Exception("User with " +Temp+ "already exists ");
			}
		}
		return userService.RegisterUser(user);
		
		
	
	
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200/")
	public User FindByEmailidAndPassword(@RequestBody User user) throws Exception {
	
		String TempEmail=user.getEmailId();
		String TempPass=user.getPassword();
		
		User userobj=null;
		if(TempEmail!=null && TempPass!=null)
		{
			userobj=userService.FindByEmailidAndPassword(TempEmail, TempPass);
			
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	
	
}
