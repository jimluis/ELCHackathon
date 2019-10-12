package com.beautyforward.beautyforward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
//@EnableJpaRepositories("com.beautyfulforward.*")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

//@ComponentScan(basePackages = "com.beautyfulforward.controller", "com.beautyfulforward.dao")
//@ComponentScan(basePackages = "com.beautyfulforward.*")
public class BeautyforwardApplication 
{

//	private static final Logger log = LoggerFactory.getLogger(BeautyforwardApplication.class);
//	@Autowired
//	private static IRepository repo;
	
//	ApplicationContext applicationContext;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(BeautyforwardApplication.class, args);
		
	
		
//		UserDAO user = new UserDAO();
//		user.setLoginId(new Long(123));
//		user.setUserName("Luis");
//		user.setProfilePicLink("Link");
//	
		
//		repo.save(user);
		
//		log.debug("new user saved");
		
	}
//	
//	@Bean
//	ApplicationRunner applicationRunner(IRepositoryDAO repo)
//	{
//		return args ->{
//			System.out.println("Application loaded");
////			log.debug("Testing the app");
//			UserDAO user = new UserDAO();
//			user.setLoginId(new Long(123));
//			user.setUserName("Luis");
//			user.setProfilePicLink("Link");
//			repo.save(user);
//		};
//	}


}
