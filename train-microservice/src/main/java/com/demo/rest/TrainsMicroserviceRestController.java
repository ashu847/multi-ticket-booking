package com.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.SourceDestination;
import com.demo.entity.TrainBook;
import com.demo.entity.Trains;
import com.demo.service.TrainServiceDTO;

@RestController
public class TrainsMicroserviceRestController {
	@Autowired
	TrainServiceDTO trService;
	
	
	@GetMapping(value="/findAllSD")
	public ResponseEntity<List<SourceDestination>> findAllSD()
	{
		List<SourceDestination> sdList= trService.findAllSD();
		return ResponseEntity.ok(sdList);
	}
	
	@PostMapping(value="/findAllTrain")
	public ResponseEntity<List<Trains>> findAllTrains(@RequestBody Trains train)
	{
		List<Trains> trainList= trService.findTrains(train);
		return ResponseEntity.ok(trainList);
	}
	
	@PostMapping(value="/bookTrains")
	public ResponseEntity<String> BookTrains(@RequestBody TrainBook trainBook)
	{
		String res= trService.bookTrain(trainBook);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping(value="/findBookings/{userId}")
	public ResponseEntity<List<TrainBook>> findAllBookings(@PathVariable("userId") String userId){
		List<TrainBook> bookings=trService.findBookings(userId);
		return ResponseEntity.ok(bookings);
	}
	
	
}
