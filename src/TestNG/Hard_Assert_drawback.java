package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_drawback
{

	@Test
	public void TC1()
	{
		int A=10; int B=20; int C=20;
		Assert.assertEquals(B, C); // pass
		Assert.assertNotEquals(B, A); //  pass
		Assert.assertEquals(A, C);  // fail
		Assert.assertNotEquals(A, B);
	}
	
	
	
	
	
}
