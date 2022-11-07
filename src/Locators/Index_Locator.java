package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Index_Locator
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ABC");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("XYZ");
		
		
		
}
}