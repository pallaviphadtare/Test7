package TestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut
{

	@Test (timeOut=8000)
	public void TC1()
	{
		
		Reporter.log("TC1 running",true);
		
	}
	
	@Test 						// by default=0
	public void TC2()
	{
		
		Reporter.log("TC2 running",true);
		
	}
	
}
