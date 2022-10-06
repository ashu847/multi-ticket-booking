package com.demo.service;

import java.util.List;

import com.demo.entity.SourceDestination;
import com.demo.entity.TrainBook;
import com.demo.entity.Trains;

public interface TrainServiceDTO {
	
	public List<SourceDestination> findAllSD();
	public List<Trains> findTrains(Trains train);
	public String bookTrain(TrainBook tb);
	public List<TrainBook> findBookings(String userId);

}
