package com.qa.testing_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackSimpleTest {
	@Test
	public void playDealerAndPlayerGreaterTest() {
		assertEquals(0, BlackJackSimple.play(22, 22));
	}
	
	@Test
	public void playDealerGreaterTest() {
		assertEquals(20, BlackJackSimple.play(22, 20));
	}
	
	@Test
	public void playPlayerGreaterTest() {
		assertEquals(0, BlackJackSimple.play(0, 22));
	}
	
	@Test
	public void playDealerAndPlayerLessTest() {
		assertEquals(16, BlackJackSimple.play(16, 12));
	}
}
