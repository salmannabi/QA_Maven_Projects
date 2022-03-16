package com.qa.exceptions;

public class Division {
	
	public static double divide(int i, int j) throws DivisionException {
		
		if (j > i) {
			throw new DivisionException("The denominator can't be larger than numerator");
		}
		
		return i / j;
	}
}
