package TestNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods
{
	@Test 
	public void Login()
	{
		Assert.fail();
		Reporter.log("Login running",true);
		
	}
	
	@Test 	(dependsOnMethods={"Login"})					// by default=0
	public void LogOut()
	{
		
		Reporter.log("LogOut running",true);
		
	}
}
