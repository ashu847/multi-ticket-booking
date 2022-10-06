package com.demo.entity;

public class User {
	
	
	private String mobileno;
	
	
	private String firstname;
	
	
	private String lastname;
	
	
	private String country;
	
	
	private String state;
	
	
	private String district;
	
	
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
