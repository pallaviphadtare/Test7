package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class assertFalse 
{
	
	@Test
	public void TC1()
	{
		boolean actualResult=true;
		Assert.assertFalse(actualResult);

	}
	
	@Test
	public void TC2()
	{
		boolean actualResult=false;
		Assert.assertFalse(actualResult);

	}


}
