package com.equalexperts.fb;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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
			solution.getFizzBuzzForRange(5,0);
		}
	@Test
	public void testFrequencies() throws FizzBuzzException{
		Map<String,Integer> frequenciesMap = new HashMap<String,Integer>();
		frequenciesMap=solution.getFrequencies(solution.getFizzBuzzForRange(1,20));
		assertTrue(frequenciesMap.get("fizzbuzz")==1);
		assertTrue(frequenciesMap.get("integer")==10);
		assertTrue(frequenciesMap.get("fizz")==4);
		assertTrue(frequenciesMap.get("buzz")==3);
		assertTrue(frequenciesMap.get("lucky")==2);
		assertFalse(frequenciesMap.get("buzz")==9);
		assertFalse(frequenciesMap.get("fizz")==10);
		assertFalse(frequenciesMap.get("fizzbuzz")==2);
	}
		
	

}
