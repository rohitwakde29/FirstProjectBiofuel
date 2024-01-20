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
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/distributorsLogin")
public class DistributorUserController {
	
	@Autowired
	DistributorUserServiceInterface distributorUserServ;
	
public DistributorUser RegisterDistUser(@RequestBody DistributorUser distributoruser) throws Exception {
		
		String Temp=distributoruser.getDistEmailId();
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
	
	public DistributorUser FindByDistEmailidAndDistPassword(@RequestBody DistributorUser distributoruser) throws Exception {
	
		String TempEmail=distributoruser.getDistEmailId();
		String TempPass=distributoruser.getDistPassword();
		
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
