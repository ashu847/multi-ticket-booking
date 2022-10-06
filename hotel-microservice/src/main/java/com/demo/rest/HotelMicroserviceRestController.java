package com.demo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Hotel;
import com.demo.entity.HotelBook;
import com.demo.service.HotelServiceDTO;

@RestController
public class HotelMicroserviceRestController {
	@Autowired
	HotelServiceDTO hotelService;
	
	@GetMapping(value="/findHotels/{city}")
	public ResponseEntity<List<Hotel>> findAllHotel(@PathVariable("city") String city){
		List<Hotel> hotels= hotelService.findHotels(city);
		return ResponseEntity.ok(hotels);
	}
	
	@PostMapping(value="/bookHotel")
	public ResponseEntity<String> bookHotel(@RequestBody HotelBook hotel){
		String res= hotelService.addHotelBooking(hotel);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping(value="/findBookHotels/{userId}")
	public ResponseEntity<List<HotelBook>> findAllBookedHotel(@PathVariable("userId") String userId){
		List<HotelBook> hotels= hotelService.findBookings(userId);
		return ResponseEntity.ok(hotels);
	}
	

}
