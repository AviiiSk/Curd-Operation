package com.curd.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiber","root","root");
		
		return connection;
		
	}
	
	
	
	
	
	

}
