package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.DistributorUser;
import com.service.DistributorUserServiceInterface;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/distributorsLogin")
public class DistributorUserController {
	
	@Autowired
	DistributorUserServiceInterface distributorUserServ;
	
	
	@PostMapping("/distRegister")
	@CrossOrigin(origins = "http://localhost:4200/")

	public DistributorUser RegisterDistUser(@RequestBody DistributorUser distributoruser) throws Exception {
		
		String Temp=distributoruser.getDistemailid();
		if(Temp!=null && !"" .equals(Temp))
		{
			DistributorUser obj=distributorUserServ.FindByDistemailid(Temp);
			
			if(obj!=null)
			{
				throw new Exception("User with " +Temp+ "already exists ");
			}
		}
		return distributorUserServ.RegisterDistUser(distributoruser);
	
	
	}
	
	
	
	@PostMapping("/distLogin")
	@CrossOrigin(origins = "http://localhost:4200/")
	public DistributorUser FindByDistEmailidAndDistPassword(@RequestBody DistributorUser distributoruser) throws Exception {
	
		String TempEmail=distributoruser.getDistemailid();
		String TempPass=distributoruser.getDistpassword();
		
		DistributorUser userobj=null;
		if(TempEmail!=null && TempPass!=null)
		{
			userobj=distributorUserServ.FindByDistemailidAndDistpassword(TempEmail, TempPass);
			
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	


}
