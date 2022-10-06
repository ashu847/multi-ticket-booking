package com.demo.entity;

import java.util.List;

public class Order {
	
	private User user;
	private List<BusBook> busBook;
	private List<HotelBook> hotelBook;
	private List<TrainBook> trainBook;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(User user, List<BusBook> busBook, List<HotelBook> hotelBook, List<TrainBook> trainBook) {
		this.user = user;
		this.busBook = busBook;
		this.hotelBook = hotelBook;
		this.trainBook = trainBook;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<BusBook> getBusBook() {
		return busBook;
	}

	public void setBusBook(List<BusBook> busBook) {
		this.busBook = busBook;
	}

	public List<HotelBook> getHotelBook() {
		return hotelBook;
	}

	public void setHotelBook(List<HotelBook> hotelBook) {
		this.hotelBook = hotelBook;
	}

	public List<TrainBook> getTrainBook() {
		return trainBook;
	}

	public void setTrainBook(List<TrainBook> trainBook) {
		this.trainBook = trainBook;
	}
	
	
	
	

}
