package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText_Locator
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
//	driver.get("C:\\class\\Pallavi\\Daily Notes\\Daily Notes_Automation\\Selenium\\Locators\\linktext.html");
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("facebook")).click();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText(" account?")).click();
	
	
	
	
}
}
