package com.equalexperts.fb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
	
	FizzBuzzSolution solution;

	@Before
	public void setUp() throws Exception {
		solution = new FizzBuzzSolution();
	}

	@Test
	public void testFizzBuzzForRange() throws FizzBuzzException {
		
		assertTrue(solution.getFizzBuzzForRange(1,3).equals("1 2 lucky"));
		assertTrue(solution.getFizzBuzzForRange(1,20).equals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"));
		
	}
	
	@Test(expected=FizzBuzzException.class)
	public void testFizzBuzzException() throws FizzBuzzException{		
			solution = new FizzBuzzSolution();
			solution.getFizzBuzzForRange(5,0);
		}
		
	

}
