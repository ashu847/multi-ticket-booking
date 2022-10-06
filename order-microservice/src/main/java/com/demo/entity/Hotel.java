package com.demo.entity;

public class Hotel {
	
	private int hotelId;
	
	
	private String hoteName;
	

	private String city;
	
	
	private String facilities;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(int hotelId, String hoteName, String city, String facilities) {
		this.hotelId = hotelId;
		this.hoteName = hoteName;
		this.city = city;
		this.facilities = facilities;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHoteName() {
		return hoteName;
	}

	public void setHoteName(String hoteName) {
		this.hoteName = hoteName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	
	

}
