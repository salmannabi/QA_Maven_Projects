package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection {
	public static final Logger LOGGER = LogManager.getLogger();
	
	private String connectionUrl = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";
	private String password = "pass";
	
	public void testConnection() {
		Connection conn = null;
		
		try {
			System.out.println("Attempting database connection...");
			conn = DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("Database connection successful!");
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					System.out.println("Attempting to close database connection...");
					conn.close();
					System.out.println("Database connection closed!");
				}
			} catch (SQLException e) {
				LOGGER.error(e.getMessage());
			}
		}
	}
}
