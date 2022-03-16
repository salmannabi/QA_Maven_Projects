package com.qa.jdbc;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
//		TestConnection test = new TestConnection();
//		test.testConnection();
		
		Person personOne = new Person("Harry", "Bradshaw", 25);
		Person personTwo = new Person("Tom", "Ford", 35);
		
		PersonDAO personDao = new PersonDAO();
		
		personDao.create(personOne);
		personDao.createPrepared(personTwo);
	}

}
