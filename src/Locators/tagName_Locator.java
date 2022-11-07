package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName_Locator
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\tagname.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Pallavi");
		driver.findElement(By.tagName("input")).sendKeys("1234");
}
}