package com.equalexperts.fb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzImplementationTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsFizz() {
		FizzBuzzImplementation implementation = new FizzBuzzImplementation();
		assertTrue(implementation.isFizz(3));
		assertTrue(implementation.isFizz(15));
		assertFalse(implementation.isFizz(2));
		assertFalse(implementation.isFizz(8));
		
	}
	
	
	@Test
	public void testIsBuzz() {
		FizzBuzzImplementation implementation = new FizzBuzzImplementation();
		assertTrue(implementation.isBuzz(5));
		assertTrue(implementation.isBuzz(15));
		assertFalse(implementation.isBuzz(8));
		assertFalse(implementation.isBuzz(18));
		
	}

}
