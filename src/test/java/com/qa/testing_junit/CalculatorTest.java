package com.qa.testing_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(4, calc.add(2, 2));
	}
	
	@Test
	public void conditionalCalcTrueTest() {
		assertEquals(6, calc.conditionalCalc(4, 2, true));
	}
	
	@Test
	public void conditionalCalcFalseTest() {
		assertEquals(2, calc.conditionalCalc(4, 2, false));
	}
}
