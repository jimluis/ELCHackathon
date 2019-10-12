package com.beautyforward.beautyforward.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beautyforward.beautyforward.dao.UserDAO;
import com.beautyforward.beautyforward.repos.UserRepository;

@RestController
public class UserController 
{
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/user/{userId}")
	public UserDAO getUserById(@PathVariable("userId") Long userId)
	{
		Optional<UserDAO> userOpt = repo.findById(userId);
		UserDAO user = userOpt.get();
		
		return user;
	}
	
	@GetMapping("/users")
	public List<UserDAO> getAllUsers()
	{
		List<UserDAO> users = repo.findAll();

		return users;
	}
	
	@PostMapping("/user")
	public String saveUser(@RequestBody UserDAO userDAO)
	{
		String response;
		
		UserDAO user = repo.save(userDAO);
		
		if(user != null)
			response = "Success";
		else
			response = "The user was not saved";
		
		return response;
	}
}
