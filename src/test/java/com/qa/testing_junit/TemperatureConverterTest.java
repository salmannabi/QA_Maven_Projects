package com.qa.testing_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureConverterTest {
	TemperatureConverter tc = new TemperatureConverter();
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		assertEquals(5.55, tc.convertFahrenheitToCelsius(42), 0.02);
	}
	
	@Test
	public void convertCelsiusToFahrenheitTest() {
		assertEquals(68, tc.convertCelsiusToFahrenheit(20), 0.02);
	}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		assertEquals(2, tc.convertKelvinToCelsius(275), 0.02);
	}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		assertEquals(280, tc.convertCelsiusToKelvin(10), 0.02);
	}
	
	@Test
	public void convertKelvinToFahrenheit() {
		assertEquals(35.6, tc.convertCelsiusToKelvin(275), 0.02);
	}
	
	@Test
	public void convertFahrenheitToKelvin() {
		assertEquals(274.67, tc.convertFahrenheitToKelvin(35), 0.02);
	}
}
