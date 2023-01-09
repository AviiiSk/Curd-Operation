package com.curd.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveOperation {

	public static void main(String[] args) {
		
		try 
		{
			ConnectionDB connectiondb = new ConnectionDB();
			Connection connection = connectiondb.getConnection();
			
			PreparedStatement preparedstatement = connection.prepareStatement("select * from user where id=5");
			
			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next())
			{
				System.out.println("ID : " + resultset.getInt(1));
				System.out.println("First Name :" + resultset.getString(2));
				System.out.println("Last Name :" + resultset.getString(3));
				System.out.println("Address :" + resultset.getString(4));
				System.out.println("City :" + resultset.getString(5));
				System.out.println("Salary :" + resultset.getString(6));
			
				
			}
			
			
		}catch(Exception e)
		{
			e.getMessage();
		}

	}

}
