package com.springboot.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practica.entity.User;
import com.springboot.practica.services.UserServices;

@RestController
@RequestMapping("/api/v1")//this is the base url for api.but if you don't want to use this kind of url you can avoid this line
//so this api will be accessible from http://localhost:8080/
public class UserController {

	    @Autowired
	    private UserServices services;

	    @GetMapping("/users")//you can give this any name you want and after adding this string to the end of base url you can use this
	    public ResponseEntity<List<User>> getAllUsers() {
	        return ResponseEntity.ok(services.getUserList());
	    }

	    @GetMapping("/user/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable int id) {
	        return ResponseEntity.ok().body(this.services.getUserById(id));
	    }

	    @PostMapping("/addUser")
	    public ResponseEntity<User> addUser(@RequestBody User user) {
	        return ResponseEntity.ok(this.services.createUser(user));
	    }

	    @PostMapping("/addUsers")
	    public ResponseEntity<List<User>> addUsers(@RequestBody List<User> list) {
	        return ResponseEntity.ok(this.services.createUserList(list));
	    }

	    @PutMapping("/updateUsers/")
	    public ResponseEntity<User> updateUser(@RequestBody User user) {
	        return ResponseEntity.ok().body(this.services.updateUserById(user));
	    }

	    @DeleteMapping("/deleteUsers/{id}")
	    public HttpStatus deleteUser(@PathVariable int id) {
	        this.services.deleteUserById(id);
	        return HttpStatus.OK;
	    }
	}
	

