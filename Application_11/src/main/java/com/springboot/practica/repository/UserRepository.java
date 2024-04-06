package com.springboot.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.practica.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
