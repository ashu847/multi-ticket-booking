package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.City;

public interface CityRepo extends JpaRepository<City, Integer> {

}
