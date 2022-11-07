package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotNull 
{

	@Test
	public void TC1()
	{
		String actualResult=null;
		Assert.assertNotNull(actualResult);
	}
	
	@Test
	public void TC2()
	{
		String actualResult="135";
		Assert.assertNotNull(actualResult);
	}
}
