package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Seat;

public interface SeatRepo extends JpaRepository<Seat, Integer> {
	
	@Query("select MAX(seatno) as seatno from Seat s where s.trainid=?1 order by s.seatno DESC")
	 String findifSeatIsNull(int trainId);
	
	@Query("select MAX(seatno) as seatno from Seat s where s.trainid=?1 order by s.seatno DESC")
	 int findTopByOrderBySeatNoDesc(int trainId);
	
	@Query("select MAX(seatId) as seatId from Seat s order by s.seatId DESC")
	String findNullIdDesc();
	
	@Query("select MAX(seatId) as seatId from Seat s order by s.seatId DESC")
	int findTopByOrderByIdDesc();

}
