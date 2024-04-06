package com.springboot.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	
	public User createUser(User user) {
		return userRepository.save(user);
	}

	public List<User> createUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
		
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "User got deleted";
	}
	
	
	
	
	
	
}
