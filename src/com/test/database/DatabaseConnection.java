package com.test.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	
	
	Connection con;
	Statement stm;
	ResultSet res;
	
	public DatabaseConnection(){
		
		
	}
	
	public Connection setConnection(){
		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Password");
		}
		 catch(Exception e){
			 
			 
		 }
		return con;
		
	}
	
	public ResultSet getResult(String sql,Connection con){
		
		try{
			stm = con.createStatement();
			res=stm.executeQuery(sql);
			
		}
		catch(Exception e){
		
	}
		return res;
	
}
	
}
