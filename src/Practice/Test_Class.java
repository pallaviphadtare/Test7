package Practice;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class
{
	POM_1 login;
	POM_2 PIM;

	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		openbrowser();
		login=new POM_1(driver);
		PIM=new POM_2(driver);
	}

	@BeforeMethod
	public void Login() throws IOException
	{
		login.enterUN(Utility_Class.getdatafrompropfile("UN"));
		login.enterPW(Utility_Class.getdatafrompropfile("PSW"));
		login.clickloginbtn();
	}
	
	
	@Test
	public void TC1()
	{
		
	}
	
	
	@AfterMethod
	public void Logout()
	{
		
	}
	
	
	
	@AfterClass
	public void CloseBrowser()
	{
		
	}
	
	
	
	
	
	
	
	
	
}
