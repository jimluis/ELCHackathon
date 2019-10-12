package com.beautyforward.beautyforward.dao;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface IRepository extends CrudRepository<UserDAO, Long>
{
	
//	public UserDAO getUser(long userId);
//	public ItemDAO getItem(long itemId);
//	public UserPreferencesDAO getUserPreferences(long preferenceId);
	
}
