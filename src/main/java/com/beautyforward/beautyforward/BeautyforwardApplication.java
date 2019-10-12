package com.beautyforward.beautyforward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beautyforward.beautyforward.utility.Utilities;

@SpringBootApplication
public class BeautyforwardApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(BeautyforwardApplication.class, args);
//		Utilities.getInstance().initDbConnection();
		
	}

}
