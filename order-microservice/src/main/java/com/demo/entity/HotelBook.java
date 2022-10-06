package com.demo.entity;

public class HotelBook {
	
	
	private int bookingId;
	
	
	private String userId;
	
	
	private int hotelId;
	
	
	private int guests;
	
	private String roomType;
	
	public HotelBook() {
		// TODO Auto-generated constructor stub
	}

	public HotelBook(int bookingId, String userId, int hotelId, int guests, String roomType) {
		this.bookingId = bookingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.guests = guests;
		this.roomType = roomType;
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

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	

}
