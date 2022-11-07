package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority
{
	@Test (priority=-2)
	public void TC1()
	{
		Reporter.log("TC1 running",true);
		
	}
	
	@Test 						// by default=0
	public void TC2()
	{
		Reporter.log("TC2 running",true);
		
	}
	
	@Test (priority=-2)
	public void AC3()
	{
		Reporter.log("AC3 running",true);
		
	}
	
	@Test (priority=2)
	public void TC4()
	{
		Reporter.log("TC4 running",true);
		
	}
	
	
	
	
}
