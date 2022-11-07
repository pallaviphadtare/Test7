package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals
{

	@Test
	public void TC1()
	{
		String expectedresult="ABC";
		String actualResult="ABC";
		Assert.assertEquals(actualResult, expectedresult);
	}
	
	@Test
	public void TC2()
	{
		String expectedresult="ABC";
		String actualResult="abc";
		Assert.assertEquals(actualResult, expectedresult);
	}
	
	
	
	
	
	
	
	
}
