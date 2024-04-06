package com.springboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.practice.entity.People;

public interface PeopleRepository extends JpaRepository<People,Integer> {

}
