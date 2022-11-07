package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount 
{


		@Test (invocationCount=5)
		public void TC1()
		{
			Reporter.log("TC1 running",true);
			
		}
}
