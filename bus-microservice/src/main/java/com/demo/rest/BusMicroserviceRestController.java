package com.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Bus;
import com.demo.entity.BusBook;
import com.demo.service.BusServiceDTO;

@RestController
public class BusMicroserviceRestController {
	@Autowired
	BusServiceDTO busService;
	
	@PostMapping(value="/addRoute")
	public String adddRoutes() {
		busService.giveBusRouteByJoining();
		return "Done";
	}
	
	@GetMapping(value="/findBus/{name}")
	public ResponseEntity<List<Bus>> findBuses(@PathVariable("name")String name){
		List<Bus> buses= busService.findBus(name);
		return ResponseEntity.ok(buses);
		
	}
	
	@PostMapping(value="/bookbus")
	public ResponseEntity<String> bookBus(@RequestBody BusBook book){
		String res= busService.bookBus(book);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping(value="/findBookBus/{userId}")
	public ResponseEntity<List<BusBook>> findBookedBuses(@PathVariable("userId")String userId){
		List<BusBook> buses= busService.findbookedBus(userId);
		return ResponseEntity.ok(buses);
		
	}

}
