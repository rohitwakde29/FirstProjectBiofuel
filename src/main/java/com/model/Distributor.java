package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Distributor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long distributorId;
	private String name;
	private String contactInfo;
	private String distributionRegion;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Order> orders;

	public Distributor() {
		super();
	}

	public Distributor(long distributorId, String name, String contactInfo, String distributionRegion,
			List<Order> orders) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.contactInfo = contactInfo;
		this.distributionRegion = distributionRegion;
		this.orders = orders;
	}

	public long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(long distributorId) {
		this.distributorId = distributorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getDistributionRegion() {
		return distributionRegion;
	}

	public void setDistributionRegion(String distributionRegion) {
		this.distributionRegion = distributionRegion;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}
