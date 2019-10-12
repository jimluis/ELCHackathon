package com.beautyforward.beautyforward.dao;

import java.util.List;


public interface IRepoService 
{
	ItemDAO saveItem(ItemDAO item);
	
	ItemDAO updateItem(ItemDAO item);
	
	List<ItemDAO> getAllItemList();
	
	ItemDAO getItem(Long itemId);
}
