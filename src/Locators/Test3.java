package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("dress");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Contact us']")).click();
	
	
	
	
	
	
	
}
}
