package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
//driver.get("https://www.facebook.com");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pallavi");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
Thread.sleep(2000);
driver.get("https://www.flipkart.com");
//Thread.sleep(5000);
//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN\"]//input[@class=\"_2IX_2- VJZDxU\"")).sendKeys("vishal");
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("vishal");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9713");

	
	
	
	
}
}
