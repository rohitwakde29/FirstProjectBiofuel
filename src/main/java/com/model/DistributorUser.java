package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DistributorUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int distid;
	
	String distemailid;
	String distname;
	String distpassword;
	
	public DistributorUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistributorUser(int distid, String distemailid, String distname, String distpassword) {
		super();
		this.distid = distid;
		this.distemailid = distemailid;
		this.distname = distname;
		this.distpassword = distpassword;
	}

	public int getDistid() {
		return distid;
	}

	public void setDistid(int distid) {
		this.distid = distid;
	}

	public String getDistemailid() {
		return distemailid;
	}

	public void setDistemailid(String distemailid) {
		this.distemailid = distemailid;
	}

	public String getDistname() {
		return distname;
	}

	public void setDistname(String distname) {
		this.distname = distname;
	}

	public String getDistpassword() {
		return distpassword;
	}

	public void setDistpassword(String distpassword) {
		this.distpassword = distpassword;
	}

	@Override
	public String toString() {
		return "DistributorUser [distid=" + distid + ", distemailid=" + distemailid + ", distname=" + distname
				+ ", distpassword=" + distpassword + "]";
	}
	
	
	
	
}

