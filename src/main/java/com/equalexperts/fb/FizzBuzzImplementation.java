package com.equalexperts.fb;

/**
 * @author
 * 
 *
 */
public class FizzBuzzImplementation implements FizzBuzz {	

	@Override
	public boolean isFizz(Integer number) 
	{
		if(number%3==0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	@Override
	public boolean isBuzz(Integer number) 
	{
		if(number%5==0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	@Override
	public boolean isLucky(Integer number)
	{
		if(number.toString().contains("3"))
		{
			return true;
		}else
		{
			return false;
		}
	}	
	    
}
