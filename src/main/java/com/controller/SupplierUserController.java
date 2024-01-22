package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SupplierUser;
import com.service.SupplierUserServiceInterface;

@RestController

@RequestMapping("/suppliersLogin")
public class SupplierUserController {
	
	@Autowired
	SupplierUserServiceInterface supplierUserServ;
	
	@PostMapping("/suppRegister")
	@CrossOrigin(origins = "http://localhost:4200/")

	public SupplierUser RegisterSuppUser(@RequestBody SupplierUser supplieruser) throws Exception {
		
		String Temp=supplieruser.getSuppemailid();
		if(Temp!=null && !"" .equals(Temp))
		{
			SupplierUser obj=supplierUserServ.FindBySuppemailid(Temp);
			
			if(obj!=null)
			{
				throw new Exception("User with " +Temp+ "already exists ");
			}
		}
		return supplierUserServ.RegisterSuppUser(supplieruser);
	
	
	}
	
	

	@PostMapping("/suppLogin")
	@CrossOrigin(origins = "http://localhost:4200/")
	public SupplierUser FindBySuppEmailidAndSuppPassword(@RequestBody SupplierUser supplieruser) throws Exception {
	
		String TempEmail=supplieruser.getSuppemailid();
		String TempPass=supplieruser.getSupppassword();
		
		SupplierUser userobj=null;
		if(TempEmail!=null && TempPass!=null)
		{
			userobj=supplierUserServ.FindBySuppemailidAndSupppassword(TempEmail, TempPass);
			
		}
		if(userobj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userobj;
	}
	
}
