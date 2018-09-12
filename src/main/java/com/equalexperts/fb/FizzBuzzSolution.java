package com.equalexperts.fb;

import static org.apache.commons.lang3.StringUtils.isNumeric;

import java.util.HashMap;
import java.util.Map;



public class FizzBuzzSolution {
	
	public static final String FIZZBUZZ ="fizzbuzz";
	public static final String FIZZ ="fizz";
	public static final String BUZZ ="buzz";
	public static final String EMPTY_SPACE =" ";
	private static final String LUCKY = "lucky";
	private static final String INTEGER = "integer";
	
	
	
	public String getFizzBuzzForRange(Integer from ,Integer to) throws FizzBuzzException{
		
		if(to < from){
			throw new FizzBuzzException("From Value cannot be smaller than the To value in a range");
		}
		
		StringBuilder sb = new StringBuilder();	
		FizzBuzz implementation = new FizzBuzzImplementation();
		for(Integer i=from;i<=to;i++){
			
			if(implementation.isLucky(i)){
				sb.append(LUCKY+EMPTY_SPACE);
				continue;
			}
			else if(implementation.isFizz(i)&&implementation.isBuzz(i))
			{
				sb.append(FIZZBUZZ+EMPTY_SPACE);
				continue;
			}
			else if(implementation.isFizz(i))
			{
				sb.append(FIZZ+EMPTY_SPACE);
			}
			else if(implementation.isBuzz(i))
			{
				sb.append(BUZZ+EMPTY_SPACE);
			}else{
				sb.append(i.toString()+EMPTY_SPACE);
			}
		}
		String output =sb.toString().trim();
	    System.out.println(output);
		Map<String,Integer> fizzbuzzMap  = new HashMap<String,Integer>();
		fizzbuzzMap = getFrequencies(output);
		printReport(fizzbuzzMap);
		return output;
		
	}
	
	private void printReport(Map<String, Integer> fizzbuzzMap) {
		StringBuilder sbFrequency = new StringBuilder();
		for(String fizzbuzz:fizzbuzzMap.keySet()){
			sbFrequency.append(fizzbuzz+":"+fizzbuzzMap.get(fizzbuzz)+EMPTY_SPACE);
		}
		System.out.println(sbFrequency.toString().trim());	
	}

	public Map<String, Integer> getFrequencies(String output) {
	
		String[] fizzbuzzArray = output.split(EMPTY_SPACE);
		Map<String,Integer> fizzbuzzMap  = new HashMap<String,Integer>();
		for(String fizzbuzzString:fizzbuzzArray){
			if(isNumeric(fizzbuzzString))
			{
				if(fizzbuzzMap.containsKey(INTEGER))
				{
					fizzbuzzMap.put(INTEGER,fizzbuzzMap.get(INTEGER)+1);
				}else
				{					
					fizzbuzzMap.put(INTEGER,1);
			    }				
			}else
			{		
				if(fizzbuzzMap.containsKey(fizzbuzzString))
				{
					fizzbuzzMap.put(fizzbuzzString,fizzbuzzMap.get(fizzbuzzString)+1);
				}else
				{				
					fizzbuzzMap.put(fizzbuzzString,1);
			    }  
			}
          
      }
		return fizzbuzzMap;
	}
}
