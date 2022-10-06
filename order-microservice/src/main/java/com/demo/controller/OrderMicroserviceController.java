package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.demo.entity.BusBook;
import com.demo.entity.HotelBook;
import com.demo.entity.Order;
import com.demo.entity.TrainBook;
import com.demo.entity.User;

@Controller
public class OrderMicroserviceController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping(value="/show/{userId}")
	public ResponseEntity<Order> shoeBookedDetails(@PathVariable("userId") String userId){
		ResponseEntity<User> resp = rt.getForEntity("http://localhost:8680/userfind/"+userId, User.class);
		
		ResponseEntity<List<TrainBook>> resp1= rt.exchange(
				"http://localhost:8780/findBookings/"+userId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<TrainBook>>() {
				});
		
		ResponseEntity<List<HotelBook>> resp2= rt.exchange(
				"http://localhost:8880/findBookHotels/"+userId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<HotelBook>>() {
				});
		
		ResponseEntity<List<BusBook>> resp3= rt.exchange(
				"http://localhost:8380/findBookBus/"+userId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<BusBook>>() {
				});
		
		
		Order order = new Order();
		order.setUser(resp.getBody());
		order.setBusBook(resp3.getBody());
		order.setHotelBook(resp2.getBody());
		order.setTrainBook(resp1.getBody());
		
		return ResponseEntity.ok(order);
		
	}

}
