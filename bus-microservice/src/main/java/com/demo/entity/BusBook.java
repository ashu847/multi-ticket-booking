package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUSBOOKING")
public class BusBook {
	
	@Id
	@Column(name="BOOKINGID")
	private int bookingId;
	
	@Column(name="USERID")
	private String userId;
	
	@Column(name="BUSID")
	private int busId;
	
	@Column(name="BOARDING")
	private String boarding;
	
	@Column(name="DROPPING")
	private String dropping;
	
	@Column(name="PASSENGERS")
	private int passengers;
	
	public BusBook() {
		// TODO Auto-generated constructor stub
	}

	public BusBook(int bookingId, String userId, int busId, String boarding, String dropping, int passengers) {
		this.bookingId = bookingId;
		this.userId = userId;
		this.busId = busId;
		this.boarding = boarding;
		this.dropping = dropping;
		this.passengers = passengers;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDropping() {
		return dropping;
	}

	public void setDropping(String dropping) {
		this.dropping = dropping;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	

}
