package com.beautyforward.beautyforward.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.beautyforward.beautyforward.dao.RepositoryDAO;
import com.beautyforward.beautyforward.dao.UserDAO;

@RestController
public class Controller 
{
	@Autowired
	private RepositoryDAO repo;
	
	@GetMapping("/user/{userId}")
	public UserDAO getUser(@PathVariable(name = "userId") long userId)
	{
		UserDAO user;
		user = repo.getUser(userId);
		return user;
	}
}
