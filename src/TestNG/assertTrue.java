package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class assertTrue
{

	@Test
	public void TC1()
	{
		boolean actualResult=true;
		Assert.assertTrue(actualResult);

	}
	
	@Test
	public void TC2()
	{
		boolean actualResult=false;
		Assert.assertTrue(actualResult);

	}
	
	
}
