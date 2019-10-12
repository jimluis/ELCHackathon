package com.beautyforward.beautyforward.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.beautyforward.beautyforward.dao.ItemDAO;
import com.beautyforward.beautyforward.dao.RoleDAO;

@Component
public interface RoleRepository extends JpaRepository<RoleDAO, Long>
{


	
}
