package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "bookingId")
public class TrainBook {
	
	
	private int bookingId;
	

	private int trainId;
	
    
	private int passengers;
    
    
    private String userId;
    
    
    private List<Seat> seatList=new ArrayList<Seat>();
    
    public TrainBook() {
		// TODO Auto-generated constructor stub
	}

	public TrainBook(int bookingId, int trainId, int passengers, String userId) {
		this.bookingId = bookingId;
		this.trainId = trainId;
		this.passengers = passengers;
		this.userId = userId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}
    
    
    
    
	
	

}
