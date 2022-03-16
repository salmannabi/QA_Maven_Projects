package com.qa.jdbc.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.jdbc.domain.Person;

public class PersonDAO {
	private static final Logger LOGGER = LogManager.getLogger();
	
	private String connectionUrl = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";
	private String password = "pass";
	
	public void create(Person person) {
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password); 
				Statement statement = conn.createStatement()) {
			statement.executeUpdate("INSERT INTO person (firstName, lastName, age) VALUES ('" + 
				person.getFirstName() + "', '" + person.getLastName() + "', '" + person.getAge() + "');");
			System.out.println("Person Created via 'create' method");
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
	}
	
	public void createPrepared(Person person) {
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				PreparedStatement pStatement = conn.prepareStatement("Insert INTO person (?, ?, ?);")) {
			pStatement.setString(1, person.getFirstName());
			pStatement.setString(2, person.getLastName());
			pStatement.setInt(3, person.getAge());
			System.out.println("Person Created via 'createPrepared' method");
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
		
	}
	
	public void readAll() {
		
	}
	
	public void readById() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
