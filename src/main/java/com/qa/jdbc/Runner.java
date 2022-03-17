package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
//		TestConnection test = new TestConnection();
//		test.testConnection();
		
		// Creating new person objects
//		Person personOne = new Person("Harry", "Bradshaw", 25);
//		Person personTwo = new Person("Tom", "Ford", 35);
		
		// Creating DAO object
		PersonDAO personDao = new PersonDAO();
		
		// Create methods
//		personDao.create(personOne);
//		personDao.createPrepared(personTwo);
		
		// Read single method
//		System.out.println("Printing person using readById() method");
//		System.out.println(personDao.readById(2));
//		System.out.println();
		
		// ReadAll method
		System.out.println("Printing list of people read by readAll() method");
		List<Person> people = personDao.readAll();
		for (Person person : people) {
			System.out.println(person);
		}
//		
		// Update method
//		Person updatePerson = new Person(2, "Philip", "James", 28);
//		personDao.update(updatePerson);
		
		// Delete method
//		personDao.delete(1);
	}

}
