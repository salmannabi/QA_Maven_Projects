package com.qa.jdbc.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Person> readAll() {
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				Statement statement = conn.createStatement()) {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
			
			List<Person> people = new ArrayList<Person>();
			while (resultSet.next()) {
				people.add(personFromResultSet(resultSet));
			}
			return people;
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
		
		return null;
	}
	
	public Person readById(int id) {
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				Statement statement = conn.createStatement()) {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM person WHERE id= " + id);
			resultSet.next();
			return personFromResultSet(resultSet);
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
		
		return null;
	}
	
	public void update(Person person) {
		try (Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				PreparedStatement pStatement = conn.
						prepareStatement("UPDATE person SET firstName = ?, lastName = ?, age = ? WHERE id = ?")) {
			pStatement.setString(1, person.getFirstName());
			pStatement.setString(2, person.getLastName());
			pStatement.setInt(3, person.getAge());
			pStatement.setInt(4, person.getId());
			pStatement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
	}
	
	public int delete(int id) {
		try(Connection conn = DriverManager.getConnection(connectionUrl, username, password);
				PreparedStatement pStatement = conn.prepareStatement("DELETE FROM person WHERE id = ?;")) {
			pStatement.setInt(1, id);
			int status = pStatement.executeUpdate();
			return status;
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
		}
		return 0;
	}
	
	public Person personFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String firstName = resultSet.getString("firstName");
		String lastName = resultSet.getString("lastName");
		int age = resultSet.getInt("age");
		
		return new Person(id, firstName, lastName, age);
	}
}
