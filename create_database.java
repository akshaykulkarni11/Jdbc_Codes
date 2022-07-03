package com.cdac.kolkata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create_database {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Ak1995");
			
			Statement stmt= conn.createStatement();
			
			stmt.executeUpdate("CREATE DATABASE jdbc_assignment");
			
			System.out.println("Database created in MySQL");
			
			conn.close();
			stmt.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}