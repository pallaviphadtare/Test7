package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("http://automationpractice.com/index.php");
Thread.sleep(1000);
driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@class='products-block-image']//img[@title='Printed Summer Dress']")).click();
	
	
	
	
	
	
}
}
