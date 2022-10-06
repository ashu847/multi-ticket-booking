package com.demo.entity;

import java.util.HashSet;
import java.util.Set;


public class City {
	
	
	private int cityId;
	
	
	private String cityName;
	

	
    private Set<Bus> buses = new HashSet<Bus>();
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Set<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

	
	

}
