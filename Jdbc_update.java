package com.cdac.kolkata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_update {

	public static void main(String[] args) {
		
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_assignment", "root","Ak1995");
			
			Statement stmt = conn.createStatement();


			String sql = "UPDATE Employee SET Designation='SYSTEM ADMINISTRATOR' WHERE EmpId=1501";

			stmt.executeUpdate(sql);
			
			System.out.println("Employee Table Updated");
			
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}