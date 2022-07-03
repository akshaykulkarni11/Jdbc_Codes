package com.cdac.kolkata.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_create_table {

	public static void main(String[] args) {
		
		try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_assignment", "root","Ak1995");
				
				Statement stmt = conn.createStatement();
				
			
					String sql = "CREATE TABLE Employee" +
			                "(EmpId INTEGER not NULL, " +
			                " EmpName VARCHAR(255), " + 
			                " Designation VARCHAR(255), " + 
			                " Email  VARCHAR(50), "+
			                " age INTEGER, " + 
			                " PRIMARY KEY ( EmpId ))"; 
					
					
					stmt.executeUpdate(sql);
					
					System.out.println("Table Created in MY_JDBC_ASSIGNMENT_NO_01");
					
					conn.close();
					stmt.close();
			
			} catch (SQLException e){
				
				e.printStackTrace();
		}				
	}
}