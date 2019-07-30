package com.dhruvdt.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "College")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int collegeId;
	@Column(name ="Name")
	String name;
	@Column(name="Address")
	String Address;
	
	
	public College(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
