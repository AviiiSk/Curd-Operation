package com.curd.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertionOperation {

	public static void main(String[] args) {
		
		try
		{
			
			ConnectionDB connectiondb = new ConnectionDB();
			Connection connection = connectiondb.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user(firstname,lastname,address,city,salary)values(?,?,?,?,?)");
			preparedStatement.setString(1,"Avesh");
			preparedStatement.setString(2,"Khan");
			preparedStatement.setString(3,"Mumbra");
			preparedStatement.setString(4,"Mumbai");
			preparedStatement.setString(5,"13000");
			
			int i = preparedStatement.executeUpdate();
			
			System.out.println("Record is Inserted..." + i);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
