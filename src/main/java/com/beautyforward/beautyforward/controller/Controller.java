package com.beautyforward.beautyforward.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beautyforward.beautyforward.dao.IRepositoryDAO;
import com.beautyforward.beautyforward.dao.ItemDAO;
import com.beautyforward.beautyforward.dao.RepositoryImp;
import com.beautyforward.beautyforward.dao.UserDAO;

@RestController
public class Controller 
{
//	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private RepositoryImp repo;
	
	
//	@PostMapping("/user/")
//	public UserDAO saveUser(@RequestBody UserDAO user)
//	{
////		log.debug("Controller.getUser - userId: "+userId);
//		
//		 repo.saveItem(item)(user);
//		 
//		return user;
//	}
	
	@PostMapping("/item")
	public ItemDAO saveUser(@RequestBody ItemDAO item)
	{
//		log.debug("Controller.getUser - userId: "+userId);
		
		 repo.saveItem(item);
		 
		return null;
	}
	
	@GetMapping("/item/{itemId}")
	public ItemDAO getItem(@PathVariable(name = "itemId") Long itemId)
	{
//		log.debug("Controller.getUser - userId: "+userId);
		
		 ItemDAO user = repo.getItem(itemId);
		 
		return user;
	}
	
	@GetMapping("/items/{itemId}")
	public List<ItemDAO> getItems(@PathVariable(name = "itemId") Long itemId)
	{
//		log.debug("Controller.getUser - userId: "+userId);
		
		List<ItemDAO>  itemList = repo.getAllItemList();
		 
		return itemList;
	}
	
//	@GetMapping("/user/{userId}")
//	public UserDAO getUser(@PathVariable(name = "userId") Long userId)
//	{
////		log.debug("Controller.getUser - userId: "+userId);
//		
//		 Optional<UserDAO> users = repo.findById(userId);
//		 UserDAO user = users.get();
//		 
//		return user;
//	}
	
//	@GetMapping("/user/items")
//	public List<UserDAO> getUser()
//	{
////		log.debug("Controller.getUser - userId: "+userId);
//		
////		 List<UserDAO> userss = repo.findAll();
////		 UserDAO user = users.get();
//		 
//		
//		return (List<UserDAO>) repo.findAll();
//	}
	
	
	
	@GetMapping("/")
	public String getTest()
	{
//		UserDAO user;
//		user = repo.getUser(userId)  ;
		return "Test";
	}
	

}
