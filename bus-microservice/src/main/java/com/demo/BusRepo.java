package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Bus;

public interface BusRepo extends JpaRepository<Bus, Integer> {
	
	List<Bus> findAllByName(String name);
	
	@Modifying
	@Query("update Bus b set b.seat=b.seat-?2 where b.busId=?1")
	void updateSeat(int busId, int passengers);

}
