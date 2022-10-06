package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SeatRepo;
import com.demo.SourceDestinationRepo;
import com.demo.TrainBookRepo;
import com.demo.TrainsRepo;
import com.demo.entity.Seat;
import com.demo.entity.SourceDestination;
import com.demo.entity.TrainBook;
import com.demo.entity.Trains;

@Service
public class TrainService implements TrainServiceDTO {
	
	@Autowired
	SourceDestinationRepo sdRepo;
	
	@Autowired
	TrainsRepo trainRepo;
	
	@Autowired
	TrainBookRepo tbRepo;
	
	@Autowired
	SeatRepo seatRepo;

	public List<SourceDestination> findAllSD(){
		List<SourceDestination> sdList= sdRepo.findAll();
		return sdList;
		
	}
	
	public List<Trains> findTrains(Trains train){
		List<Trains> trainList= trainRepo.findTrains(train.getSourceId(), train.getDestinationId(),train.getDepartureDate());
		return trainList;
	}
	
	@Transactional
	public String bookTrain(TrainBook tb) {
		
		Optional<Trains> train= trainRepo.findById(tb.getTrainId());
		
		if(train.get().getSeat()>=tb.getPassengers()) {
		
		trainRepo.seatUpdate(tb.getPassengers(), tb.getTrainId());
		 List<Seat> seatList = new ArrayList<Seat>();
         int seatno = 1;
         int autoId;
         int bookingId;
         if(seatRepo.findNullIdDesc() == null) {
              autoId = 1;
              bookingId=1;
         }
         else {
              autoId = seatRepo.findTopByOrderByIdDesc()+1;
              bookingId=tbRepo.findTopByOrderByBookingIdDesc()+1;
         }
         int range=tb.getPassengers();
         if (seatRepo.findifSeatIsNull(tb.getTrainId()) == null) {
             seatno=1;
              range=tb.getPassengers();
         }
         else {
             seatno= seatRepo.findTopByOrderBySeatNoDesc(tb.getTrainId()) + 1;
             range = tb.getPassengers() +seatno;
         }
         tb.setBookingId(bookingId);
         tbRepo.save(tb);
         for (int i = seatno; i <= range; i++) {
             Seat seats = new Seat();
             seats.setTrainid(tb.getTrainId());
             seats.setSeatno(i);
             seats.setSeatId(autoId++);
             seats.setStatus("Confirm");
             seats.setBookTrain(tb);
             seatList.add(seats);
         }
         seatRepo.saveAll(seatList);
         return "Saved Successfully!";
		}
		else {
			return "Not Enough Seats! booking Failed...";
		}
		
	}
	
	
	public List<TrainBook> findBookings(String userId){
		List<TrainBook> bookings= tbRepo.findAllBooking(userId);
		return bookings;
		
	}
	
}
