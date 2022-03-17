package com.qa.jdbc.controllers;

import java.util.List;
import java.util.Scanner;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class PersonController {
	private PersonDAO personDao;
	
	public PersonController(PersonDAO personDao) {
		this.personDao = personDao;
	}
	
	public void create(Scanner scanner) {		
		System.out.print("Please enter a first name: ");
		String firstName = scanner.nextLine();
		System.out.print("Please enter a last name: ");
		String lastName = scanner.nextLine();
		System.out.print("Please enter the age of the person: ");
		int age = scanner.nextInt();
		// Clear scanner
		scanner.nextLine();
		
		personDao.create(new Person(firstName, lastName, age));
		System.out.println("Person Created via 'create' method");
	}
	
	public void readAll() {
		System.out.println("Printing list of people read by readAll() method");
		List<Person> personList = personDao.readAll();
		for (Person person : personList) {
			System.out.println(person);
		}
		System.out.println();
	}
	
	public void readById(Scanner scanner) {
		System.out.print("Enter the id of the person you want to check: ");
		int id = scanner.nextInt();
		// Clear scanner
		scanner.nextLine();
		
		System.out.println(personDao.readById(id));
		System.out.println();
	}
	
	public void update(Scanner scanner) {
		System.out.print("Please enter the first name: ");
		String firstName = scanner.nextLine();
		System.out.print("Please enter a last name: ");
		String lastName = scanner.nextLine();
		System.out.print("Please enter the age of the person: ");
		int age = scanner.nextInt();
		
		System.out.print("Please enter the id of the row to modify: ");
		int id = scanner.nextInt();
		// Clear scanner
		scanner.nextLine();
		
		personDao.update(new Person(id, firstName, lastName, age));
		System.out.println("Person Updated");
	}
	
	public void delete(Scanner scanner) {
		System.out.print("Enter the id of the person you want to delete: ");
		int id = scanner.nextInt();
		// Clear scanner
		scanner.nextLine();
		
		personDao.delete(id);
		System.out.println("Person Deleted");
	}
}
