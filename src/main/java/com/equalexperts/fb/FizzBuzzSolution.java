package com.equalexperts.fb;

public class FizzBuzzSolution {
	
	public static final String FIZZBUZZ ="fizzbuzz";
	public static final String FIZZ ="fizz";
	public static final String BUZZ ="buzz";
	public static final String EMPTY_SPACE =" ";
	private static final String LUCKY = "lucky";
	
	
	
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
		return sb.toString().trim();
		
	}
}
