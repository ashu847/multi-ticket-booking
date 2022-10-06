package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Trains;

public interface TrainsRepo extends JpaRepository<Trains, Integer> {
	
	
	@Query(value="select t from Trains t where t.sourceId=?1 and t.destinationId=?2 and t.departureDate=?3 and t.departureDate>=now()")
	List<Trains> findTrains(int sourceId, int destinationId, String departureDate);

	@Modifying
	@Query(value="update Trains t set t.seat=t.seat-?1 where trainId=?2")
	void seatUpdate(int passengers, int trainId);
}
