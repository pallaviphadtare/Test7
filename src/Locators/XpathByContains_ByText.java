package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_ByText 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("dresses");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[1]")).click();
}
}