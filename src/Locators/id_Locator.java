package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_Locator
{
	
	
		public static void main(String[] args) throws InterruptedException 
		{

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Locators\\id1.html");
			Thread.sleep(2000);
			driver.findElement(By.id("abc123")).sendKeys("vishal");
			Thread.sleep(2000);
			driver.findElement(By.id("abc456")).sendKeys("46");
	}
	
	}
	
	
	
	
	
	
	
	

