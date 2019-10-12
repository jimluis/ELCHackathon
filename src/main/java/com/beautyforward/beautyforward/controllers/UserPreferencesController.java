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
import com.beautyforward.beautyforward.dao.UserPreferencesDAO;
import com.beautyforward.beautyforward.repos.UserPreferencesRepository;
import com.beautyforward.beautyforward.repos.UserRepository;

@RestController
public class UserPreferencesController 
{
	@Autowired
	private UserPreferencesRepository repo;
	
	@GetMapping("/userpref/{userPreferenceId}")
	public UserPreferencesDAO getUserById(@PathVariable("userPreferenceId") Long userPreferenceId)
	{
		Optional<UserPreferencesDAO> userOpt = repo.findById(userPreferenceId);
		UserPreferencesDAO user = userOpt.get();
		
		return user;
	}
	
	@GetMapping("/userpref")
	public List<UserPreferencesDAO> getAllUsers()
	{
		List<UserPreferencesDAO> users = repo.findAll();

		return users;
	}
	
	@PostMapping("/userpref")
	public String saveUser(@RequestBody UserPreferencesDAO userDAO)
	{
		String response;
		
		UserPreferencesDAO user = repo.save(userDAO);
		
		if(user != null)
			response = "Success";
		else
			response = "The user was not saved";
		
		return response;
	}
}
