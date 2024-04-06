package com.springboot.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practice.entity.People;
import com.springboot.practice.repository.PeopleRepository;

@Service
public class PeopleServices {

	@Autowired
	private PeopleRepository peoplerepository;
	
	public People createPeop(People people)
	{
		return peoplerepository.save(people);
	}
	
	public List<People> createList(List<People> list)
	{
		return peoplerepository.saveAll(list);
	}
}
