package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DistributorUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int distId;
	
	String distEmailId;
	String distName;
	String distPassword;
	public DistributorUser() {
		super();
	}
	public DistributorUser(int distId, String distEmailId, String distName, String distPassword) {
		super();
		this.distId = distId;
		this.distEmailId = distEmailId;
		this.distName = distName;
		this.distPassword = distPassword;
	}
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	public String getDistEmailId() {
		return distEmailId;
	}
	public void setDistEmailId(String distEmailId) {
		this.distEmailId = distEmailId;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getDistPassword() {
		return distPassword;
	}
	public void setDistPassword(String distPassword) {
		this.distPassword = distPassword;
	}
	
	
}

