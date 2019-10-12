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

import com.beautyforward.beautyforward.dao.IRepoService;
import com.beautyforward.beautyforward.dao.IRepositoryDAO;
import com.beautyforward.beautyforward.dao.ItemDAO;
import com.beautyforward.beautyforward.dao.RepositoryImp;

@RestController
public class Controller 
{
//	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private IRepositoryDAO repo;
	
	
//	@PostMapping("/user/")
//	public UserDAO saveUser(@RequestBody UserDAO user)
//	{
////		log.debug("Controller.getUser - userId: "+userId);
//		
//		 repo.saveItem(item)(user);
//		 
//		return user;
//	}
	
	@GetMapping("/test")
	public String getItem()
	{
//		log.debug("Controller.getUser - userId: "+userId);
		System.out.println("Getting items");
//		 ItemDAO user = repo.getItem(itemId);
		 
		return "Test";
	}
	
	@PostMapping("/item")
	public ItemDAO saveUser(@RequestBody ItemDAO item)
	{
//		log.debug("Controller.getUser - userId: "+userId);
		System.out.println("Getting item");
		
		 repo.save(item);
		 
		return null;
		
	}
	
	
	
	@GetMapping("/item/{itemId}")
	public ItemDAO getItem(@PathVariable(name = "itemId") Long itemId)
	{
//		log.debug("Controller.getUser - userId: "+userId);
		System.out.println("Getting items");
		 Optional<ItemDAO> users = repo.findById(itemId);
		 ItemDAO user = users.get();
		 
		// user = repo.findById(itemId).orElse(new ItemDAO());
		return user;
	}
	

	@GetMapping("/items")
	public List<ItemDAO> getUser()
	{
//		log.debug("Controller.getUser - userId: "+userId);
		
//		 List<UserDAO> userss = repo.findAll();
//		 UserDAO user = users.get();
		 
		
		return repo.findAll();
	}
	
	
//	@GetMapping("/items/{userId}")
//	public List<ItemDAO> getItems(@PathVariable(name = "itemId") Long userId)
//	{
////		log.debug("Controller.getUser - userId: "+userId);
//		
//		List<ItemDAO>  itemList = repo.findAllById(userId);
//		 
//		return itemList;
//	}
	
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
	

	


}
