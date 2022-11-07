package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Of_TCE
{
	@Test (groups="Login")
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test(groups="Login")
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test(groups="PIM")
	public void TC3()
	{
		Reporter.log("Running TC3", true);
	}
	
	@Test(groups="PIM")
	public void TC4()
	{
		Reporter.log("Running TC4", true);
	}
	
	@Test(groups="Admin")
	public void TC5()
	{
		Reporter.log("Running TC5", true);
	}
	
	@Test(groups="Date")
	public void TC6()
	{
		Reporter.log("Running TC6", true);
	}
}
