package com.beautyforward.beautyforward.utility;

import java.sql.* ;
import javax.sql.DataSource;

public class Utilities 
{
	private static Connection con;
	private static Utilities instance = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    String user = "system"; 
    String pass = "12345";
    
    
    private Utilities()
    {
    		
    }
    
    public static Utilities getInstance()
    {
    	if(instance == null)
    		instance = new Utilities();
    	
    	return instance;
    }
    
	public void initDbConnection()
	{
		try 
		{
			String url      = "jdbc:h2:~/test";   //database specific url.
			String user     = "sa";
			String password = "";

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void closeDbConnection(Connection con)
	{
		try 
		{
			con.close();
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public Connection getDBConnection()
	{
		try 
		{
			if(con == null)
			{
				initDbConnection();
			}
			
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		return con;
	}
		
	
}
