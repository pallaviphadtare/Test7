package POM_with_DDF_TestNG_Base_Utility_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_Class
{

	public WebDriver driver;
	
	
	
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait
			Thread.sleep(2000);
			
		// maximize webpage
			driver.manage().window().maximize();
			
		// wait
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	}
}
