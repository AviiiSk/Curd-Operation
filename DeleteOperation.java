package com.curd.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteOperation {

	public static void main(String[] args) {
		
		try
		{
			
			ConnectionDB connectiondb = new ConnectionDB();
			Connection connection = connectiondb.getConnection();
			
			PreparedStatement preparedstatement = connection.prepareStatement("delete from user where id=?");
			preparedstatement.setInt(1, 3);
			
			int i = preparedstatement.executeUpdate();
			System.out.println("Record is Deleted...." + i);
		
			
		}catch(Exception e)
		{
			e.getMessage();
		}
		
		
		
		
	}

}
