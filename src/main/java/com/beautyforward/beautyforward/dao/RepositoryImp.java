package com.beautyforward.beautyforward.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class RepositoryImp implements IRepositoryDAO
{

	@Autowired
	private IRepositoryDAO repo;
	
	@Override
	public List<UserDAO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDAO> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDAO> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UserDAO> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<UserDAO> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDAO getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserDAO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> S save(S entity) {
		repo.save(entity);
		return null;
	}

	@Override
	public Optional<UserDAO> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserDAO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UserDAO> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UserDAO> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserDAO> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends UserDAO> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

//	Connection con;
//	
//	public RepositoryDAO()
//	{
//		con = Utilities.getInstance().getDBConnection();
//	}
//	
//	@Override
//	public UserDAO getUser(long itemId) 
//	{
//		UserDAO user = null;
//		ResultSet rs = null;
//		PreparedStatement ps = null;
//
//		try 
//		{
//			ps = con.prepareStatement(Constants.GET_USER);
//			ps.setLong(1, itemId);
//			rs = ps.executeQuery();
//			
//			if(rs != null)
//			{
//				user = new UserDAO();
//				
//				while(rs.next())
//				{
//					user.setUserId(rs.getLong("user_id"));
//					user.setLoginId(rs.getLong("login_id"));
//					user.setUserName(rs.getString("user_name"));
//					user.setProfilePicLink(rs.getString("profile_picture"));
//					user.setUserPreferenceId(rs.getLong("user_preference_id"));
//				}
//			}
//			else
//			{
//				System.out.println("Not data found");
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return user;
//	}
//
//	@Override
//	public ItemDAO getItem(long itemId) 
//	{
//		ItemDAO item = null;
//		ResultSet rs = null;
//		PreparedStatement ps = null;
//
//		try 
//		{
//			ps = con.prepareStatement(Constants.GET_ITEM);
//			ps.setLong(1, itemId);
//			rs = ps.executeQuery();
//			
//			if(rs != null)
//			{
//				item = new ItemDAO();
//				
//				while(rs.next())
//				{
//					item.setItemId(rs.getLong("item_id"));
//					item.setTitle(rs.getString("title"));
//					item.setDescription(rs.getString("description"));
//					item.setShade(rs.getString("shade"));
//					item.setColor(rs.getString("color"));
//					item.setProductCategory(rs.getString("product_category"));
//				}
//			}
//			else
//			{
//				System.out.println("Not data found");
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return item;
//	}
//
//	@Override
//	public UserPreferencesDAO getUserPreferences(long preferenceId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
