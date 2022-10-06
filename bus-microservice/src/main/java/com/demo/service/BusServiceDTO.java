package com.demo.service;

import java.util.List;

import com.demo.entity.Bus;
import com.demo.entity.BusBook;

public interface BusServiceDTO {
	
	public Bus giveBusRouteByJoining();
	public List<Bus> findBus(String name);
	public String bookBus(BusBook book);
	public List<BusBook> findbookedBus(String userId);

}
