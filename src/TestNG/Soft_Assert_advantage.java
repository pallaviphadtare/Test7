package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_advantage 
{

	
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();		
		String S1="Hi";		
		String S2="Hello";			
		String S3="Good Morning";		
		soft.assertEquals(S1, S2);            //Fail		
		soft.assertNotEquals(S1, S2);         //Pass		
		soft.assertEquals(S1, S3);           //Fail		
		soft.assertNotEquals(S1, S3);       //Pass		
		soft.assertAll();

	}
	

}
