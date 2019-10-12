package com.beautyforward.beautyforward.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.beautyforward.beautyforward.dao.ItemDAO;

@Component
public interface IItemRepository extends JpaRepository<ItemDAO, Long>
{


	
}
