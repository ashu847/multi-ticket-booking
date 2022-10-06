package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name="MOBILENO")
	private String mobileno;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="EMAIL")
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String mobileno, String firstname, String lastname, String country, String state, String district,
			String email) {
		this.mobileno = mobileno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.state = state;
		this.district = district;
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
