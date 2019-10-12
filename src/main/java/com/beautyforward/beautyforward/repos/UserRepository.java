package com.beautyforward.beautyforward.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.beautyforward.beautyforward.dao.UserDAO;

@Component
public interface UserRepository extends JpaRepository<UserDAO, Long>
{
	
}
