package com.beautyforward.beautyforward.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.beautyforward.beautyforward.dao.ItemDAO;
import com.beautyforward.beautyforward.dao.UserLoginDAO;

@Component
public interface UserLoginRepository extends JpaRepository<UserLoginDAO, Long>
{

	UserLoginDAO findByUserName(String username);


	
}
