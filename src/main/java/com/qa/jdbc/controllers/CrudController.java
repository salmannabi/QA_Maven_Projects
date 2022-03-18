package com.qa.jdbc.controllers;

import java.util.Scanner;

public interface CrudController<T> {
	
	void create(Scanner scanner);
	
	void readAll();
	
	void readById(Scanner scanner);
	
	void update(Scanner scanner);
	
	void delete(Scanner scanner);
}
