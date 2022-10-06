package com.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.BusBookRepo;
import com.demo.BusRepo;
import com.demo.CityRepo;
import com.demo.entity.Bus;
import com.demo.entity.BusBook;
import com.demo.entity.City;


@Service
public class BusService implements BusServiceDTO {
	
	@Autowired
	BusRepo busRepo;
	
	@Autowired
	CityRepo cityRepo;
	
	@Autowired
	BusBookRepo bbRepo;
	public Bus giveBusRouteByJoining(){
        int busId=2;
        Optional<Bus> bus = busRepo.findById(busId);
        Optional<City> c1 = cityRepo.findById(1);
        Optional<City> c2 = cityRepo.findById(7);
        Optional<City> c3 = cityRepo.findById(4);
        Optional<City> c4 = cityRepo.findById(6);
        Optional<City> c5 = cityRepo.findById(3);
        Set<City> cityList = new HashSet<City>();
        
        cityList.add(c1.get());
        cityList.add(c2.get());
        cityList.add(c3.get());
        cityList.add(c4.get());
        cityList.add(c5.get());
        bus.get().setRoutes(cityList);
        
         busRepo.save(bus.get());
         return bus.get();
        
    }
	
	public List<Bus> findBus(String name){
		List<Bus> buses= busRepo.findAllByName(name);
		return buses;
	}
	
	@Transactional
	public String bookBus(BusBook book) {
		Optional<Bus> bus= busRepo.findById(book.getBusId());
		if(bus.get().getSeat()>book.getPassengers()) {
		bbRepo.save(book);
		busRepo.updateSeat(book.getBusId(), book.getPassengers());
		return "Bus Booked Succesffuly";
		}
		else {
		return "Not enough seat ! Bus Booked Failed";
		}
		
	}
	
	public List<BusBook> findbookedBus(String userId){
		List<BusBook> buses= bbRepo.findAllByUserId(userId);
		return buses;
	}

}
