package com.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.BusBook;

public interface BusBookRepo extends JpaRepository<BusBook, Integer> {
	
	List<BusBook> findAllByUserId(String userId);

	
}
