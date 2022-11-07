package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled
{
	
	@Test (enabled=false)
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		
	}
	
	@Test 						// by default=0
	public void TC2()
	{
		
		Reporter.log("TC2 running",true);
		
	}
	
	@Test 
	public void TC3()
	{
		Reporter.log("TC3 running",true);
		
	}
	
	
}
