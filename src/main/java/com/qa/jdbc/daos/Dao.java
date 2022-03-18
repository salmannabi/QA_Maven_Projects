package com.qa.jdbc.daos;

import java.util.List;

public interface Dao<T> {
	
	void create(T t);

	List<T> readAll();
	
	T readById(int id);
	
	void update(T t);
	
	int delete(int id);
}
