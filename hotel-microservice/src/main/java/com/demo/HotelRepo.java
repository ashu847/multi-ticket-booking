package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {
	
	List<Hotel> findAllByCity(String city);

}
