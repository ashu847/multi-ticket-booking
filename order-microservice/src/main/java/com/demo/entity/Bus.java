package com.demo.entity;

import java.util.HashSet;
import java.util.Set;


public class Bus {
	
	
	private int busId;
	
	
	private String busName;
	
	private String name;
	
	
	private String fromDate;
	

	private int seat;
	

	   
	    private Set<City> routes = new HashSet<City>();
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	

	public Bus(int busId, String busName, String name, String fromDate, int seat) {
		this.busId = busId;
		this.busName = busName;
		this.name = name;
		this.fromDate = fromDate;
		this.seat = seat;
	}



	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}



	public Set<City> getRoutes() {
		return routes;
	}



	public void setRoutes(Set<City> routes) {
		this.routes = routes;
	}
	
	

	
	

}
