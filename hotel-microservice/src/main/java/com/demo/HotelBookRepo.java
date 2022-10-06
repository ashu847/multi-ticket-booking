package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.HotelBook;

public interface HotelBookRepo extends JpaRepository<HotelBook, Integer> {
	
	List<HotelBook> findAllByUserId(String userId);

}
