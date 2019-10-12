package com.beautyforward.beautyforward.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//@Component
public interface IRepositoryDAO extends JpaRepository<ItemDAO, Long>
{

	
}
