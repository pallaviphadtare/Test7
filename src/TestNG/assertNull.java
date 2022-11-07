package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNull
{
	
	@Test
	public void TC1()
	{
		String actualResult=null;
		Assert.assertNull(actualResult);
	}
	
	@Test
	public void TC2()
	{
		String actualResult="135";
		Assert.assertNull(actualResult);
	}
	
	
	
	
	

}
