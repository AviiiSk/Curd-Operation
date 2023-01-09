package com.curd.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateOperation {

	public static void main(String[] args) {
		
		try
		{
			
			ConnectionDB connectiondb = new ConnectionDB();
			Connection connection = connectiondb.getConnection();
			
			PreparedStatement preparedstatement = connection.prepareCall("update user set firstname=?, lastname=? where id=?");
			
			preparedstatement.setString(1,"Kunal");
			preparedstatement.setString(2,"Verma");
			preparedstatement.setString(3,"3");
			
			int i = preparedstatement.executeUpdate();
			
			System.out.println("Recort is Update...." + i);
			
			
		}catch (Exception e)
		{
			
			e.getMessage();
			
		}
		
		
		
		
		

	}

}
