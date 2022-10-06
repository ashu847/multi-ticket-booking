package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Login;

public interface LoginRepo extends JpaRepository<Login, String> {

}
