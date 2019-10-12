package com.beautyforward.beautyforward.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.beautyforward.beautyforward.dao.IRepository;
import com.beautyforward.beautyforward.dao.UserDAO;

@RestController
public class Controller 
{
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private IRepository repo;
	
	@GetMapping("/user/{userId}")
	public UserDAO getUser(@PathVariable(name = "userId") Long userId)
	{
		log.debug("Controller.getUser - userId: "+userId);
		
		 Optional<UserDAO> users = repo.findById(userId);
		 UserDAO user = users.get();
		 
		return user;
	}
	
	@GetMapping("/")
	public String getTest()
	{
//		UserDAO user;
//		user = repo.getUser(userId)  ;
		return "Test";
	}
}
