package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.TrainBook;

public interface TrainBookRepo extends JpaRepository<TrainBook, Integer> {
	
	@Query(value="select MAX(bookingId) as bookingId from TrainBook s order by s.bookingId DESC")
	int findTopByOrderByBookingIdDesc();
	
	
	@Query("select b from TrainBook b where b.userId=?1")
	List<TrainBook> findAllBooking(String userId);

}
