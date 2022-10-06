package com.demo.entity;

public class BusBook {
	
	
	private int bookingId;
	
	
	private String userId;
	
	
	private int busId;
	
	
	private String boarding;
	
	
	private String dropping;
	
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
