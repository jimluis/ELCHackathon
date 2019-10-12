package com.beautyforward.beautyforward.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.beautyforward.beautyforward.dao.UserDAO;
import com.beautyforward.beautyforward.dao.UserPreferencesDAO;

@Component
public interface UserPreferencesRepository extends JpaRepository<UserPreferencesDAO, Long>
{

	Optional<UserPreferencesDAO> findByUserId(Long userId);
	
}
