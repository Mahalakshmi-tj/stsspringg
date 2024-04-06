package com.springboot.web.dao;
 import org.springframework.data.repository.CrudRepository;


import com.springboot.web.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> 
{

}
