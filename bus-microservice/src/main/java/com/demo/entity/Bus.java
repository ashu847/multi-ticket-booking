package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BUS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "busId")
public class Bus {
	
	@Id
	@Column(name="BUSID")
	private int busId;
	
	@Column(name="BUSNAME")
	private String busName;
	
	@Column(name="SOUCEDESTINATION")
	private String name;
	
	@Column(name="FROMDATE")
	private String fromDate;
	
	@Column(name="SEAT")
	private int seat;
	

	   @ManyToMany
	    @JoinTable(name = "ROUTE", joinColumns = @JoinColumn(name = "BUSID"), inverseJoinColumns = @JoinColumn(name = "CITYID"))
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
