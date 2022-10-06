package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.HotelBookRepo;
import com.demo.HotelRepo;
import com.demo.entity.Hotel;
import com.demo.entity.HotelBook;

@Service
public class HotelService implements HotelServiceDTO {
	
	@Autowired
	HotelRepo hotelRepo;
	
	@Autowired
	HotelBookRepo hbRepo;
	
	public List<Hotel> findHotels(String city) {
		List<Hotel> hotels= hotelRepo.findAllByCity(city);
		return hotels;
		
	}
	
	public String addHotelBooking(HotelBook hb) {
	hbRepo.save(hb);
	return "Hotel booked Succesfully";
	}
	
	public List<HotelBook> findBookings(String userId){
		List<HotelBook> bookings= hbRepo.findAllByUserId(userId);
		return bookings;
	}

}
