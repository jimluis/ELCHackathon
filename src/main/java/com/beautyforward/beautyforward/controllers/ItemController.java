package com.beautyforward.beautyforward.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beautyforward.beautyforward.dao.ItemDAO;
import com.beautyforward.beautyforward.repos.IItemRepository;

@RestController
public class ItemController 
{
	private static final Logger log = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	private IItemRepository repo;
	
	@GetMapping("/test")
	public String getItem()
	{
		log.debug("Controller.getItem");
		System.out.println("Getting items");
		 
		return "This is a Test";
	}
	
	@PostMapping("/item")
	public String saveItem(@RequestBody ItemDAO item)
	{
		String response;
		log.debug("Controller.saveUser - userId");
		System.out.println("Getting item");
		
		ItemDAO savedItem = repo.save(item);
		 
		if(savedItem != null)
			response = "Success";
		else
			response = "Item not saved";
			
		return response;
	}
	
	
	@GetMapping("/item/{itemId}")
	public ItemDAO getItem(@PathVariable(name = "itemId") Long itemId)
	{
		log.debug("Controller.getUser - userId: "+itemId);
		System.out.println("Getting items");
		 Optional<ItemDAO> users = repo.findById(itemId);
		 ItemDAO user = users.get();
		 
		return user;
	}

//	@GetMapping("/items/{userId}")
//	public List<ItemDAO> getUser(@PathVariable(name = "userId") Long userId)
//	{
//		return repo.findAll(userId);
//	}
	

}
