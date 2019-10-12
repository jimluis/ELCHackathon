package com.beautyforward.beautyforward.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beautyforward.beautyforward.utility.Constants;
import com.beautyforward.beautyforward.utility.Utilities;

public class RepositoryDAO implements IRepository{

	Connection con;
	
	public RepositoryDAO()
	{
		con = Utilities.getInstance().getDBConnection();
	}
	
	@Override
	public UserDAO getUser(long itemId) 
	{
		UserDAO user = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try 
		{
			ps = con.prepareStatement(Constants.GET_USER);
			ps.setLong(1, itemId);
			rs = ps.executeQuery();
			
			if(rs != null)
			{
				user = new UserDAO();
				
				while(rs.next())
				{
					user.setUserId(rs.getLong("user_id"));
					user.setLoginId(rs.getLong("login_id"));
					user.setUserName(rs.getString("user_name"));
					user.setProfilePicLink(rs.getString("profile_picture"));
					user.setUserPreferenceId(rs.getLong("user_preference_id"));
				}
			}
			else
			{
				System.out.println("Not data found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public ItemDAO getItem(long itemId) 
	{
		ItemDAO item = null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try 
		{
			ps = con.prepareStatement(Constants.GET_ITEM);
			ps.setLong(1, itemId);
			rs = ps.executeQuery();
			
			if(rs != null)
			{
				item = new ItemDAO();
				
				while(rs.next())
				{
					item.setItemId(rs.getLong("item_id"));
					item.setTitle(rs.getString("title"));
					item.setDescription(rs.getString("description"));
					item.setShade(rs.getString("shade"));
					item.setColor(rs.getString("color"));
					item.setProductCategory(rs.getString("product_category"));
				}
			}
			else
			{
				System.out.println("Not data found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return item;
	}

	@Override
	public UserPreferencesDAO getUserPreferences(long preferenceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
