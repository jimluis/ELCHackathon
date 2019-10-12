package com.beautyforward.beautyforward.dao;

import org.apache.catalina.User;

public interface IRepository 
{
	public UserDAO getUser(long userId);
	public ItemDAO getItem(long itemId);
	public UserPreferencesDAO getUserPreferences(long preferenceId);
	
}
