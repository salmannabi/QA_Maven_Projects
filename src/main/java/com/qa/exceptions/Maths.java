package com.qa.exceptions;

public class Maths {
	
	public static double multiply(int i, int j) throws MultiplyByFiveException {
		
		if (i == 5 || j == 5) {
			throw new MultiplyByFiveException("You can't multiply by 5");
		}
		
		return i * j;
	}
}
