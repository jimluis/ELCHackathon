package com.beautyforward.beautyforward.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface IRepositoryDAO extends JpaRepository<UserDAO, Long>
{
	
//	public UserDAO getUser(long userId);
//	public ItemDAO getItem(long itemId);
//	public UserPreferencesDAO getUserPreferences(long preferenceId);
	
}
