package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertFail
{

		@Test
		public void TC1()
		{
			Reporter.log("TC1 running", true);
		}
		
		@Test
		public void TC2()
		{
			Assert.fail();
			Reporter.log("TC2 running", true);
		}
	}
	

