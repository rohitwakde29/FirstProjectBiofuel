package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int suppid;
	
	String suppemailid;
	String suppname;
	String supppassword;

	public SupplierUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplierUser(int suppid, String suppemailid, String suppname, String supppassword) {
		super();
		this.suppid = suppid;
		this.suppemailid = suppemailid;
		this.suppname = suppname;
		this.supppassword = supppassword;
	}

	public int getSuppid() {
		return suppid;
	}

	public void setSuppid(int suppid) {
		this.suppid = suppid;
	}

	public String getSuppemailid() {
		return suppemailid;
	}

	public void setSuppemailid(String suppemailid) {
		this.suppemailid = suppemailid;
	}

	public String getSuppname() {
		return suppname;
	}

	public void setSuppname(String suppname) {
		this.suppname = suppname;
	}

	public String getSupppassword() {
		return supppassword;
	}

	public void setSupppassword(String supppassword) {
		this.supppassword = supppassword;
	}

	@Override
	public String toString() {
		return "SupplierLogin [suppid=" + suppid + ", suppemailid=" + suppemailid + ", suppname=" + suppname
				+ ", supppassword=" + supppassword + "]";
	}
	
	
	
}
