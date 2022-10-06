package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.SourceDestination;

public interface SourceDestinationRepo extends JpaRepository<SourceDestination, Integer> {

}
