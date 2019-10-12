package com.beautyforward.beautyforward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beautyforward.beautyforward.dao.IRepository;
import com.beautyforward.beautyforward.dao.UserDAO;
import com.beautyforward.beautyforward.utility.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class BeautyforwardApplication 
{

	private static final Logger log = LoggerFactory.getLogger(BeautyforwardApplication.class);
	@Autowired
	private static IRepository repo;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(BeautyforwardApplication.class, args);
//		Utilities.getInstance().initDbConnection();
		
		log.debug("Testing the app");
		UserDAO user = new UserDAO();
		user.setLoginId(new Long(123));
		user.setUserName("Luis");
		user.setProfilePicLink("Link");
		
		repo.save(user);
		
		log.debug("new user saved");
		
	}

}
