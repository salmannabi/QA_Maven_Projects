package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// Testing MultiplyByFive exception
		System.out.println("Testing own implementation of divisoin exception");
		try {
			System.out.println(Maths.multiply(2, 5));;
		} catch (MultiplyByFiveException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		// Division with exceptions exercise
		System.out.println("Exercise: Test Division");
		System.out.println("------------------------");
		
		Scanner scanner = new Scanner(System.in);
		int numOne = 0;
		int numTwo = 0;
		
		try {
			System.out.print("Input numerator: ");
			numOne = scanner.nextInt();
			System.out.print("Input Denominator: ");
			numTwo = scanner.nextInt();
			
			System.out.println(Division.divide(numOne, numTwo));
		} catch (InputMismatchException e) {
			scanner.next();
			System.out.println("Java InputMismatchException: " + e.getMessage());
		} catch (DivisionException e) {
			System.out.println("Implemented Exception: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("General Java Exception: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
