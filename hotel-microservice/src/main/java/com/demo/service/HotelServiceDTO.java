package com.demo.service;

import java.util.List;

import com.demo.entity.Hotel;
import com.demo.entity.HotelBook;

public interface HotelServiceDTO {
	
	public List<Hotel> findHotels(String city);
	public String addHotelBooking(HotelBook hb);
	public List<HotelBook> findBookings(String userId);

}
