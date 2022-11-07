package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("T-shirts");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[text()='Contact us']")).click();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'search_query')]")).sendKeys("T-shirts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).click();
	
	
	
	
}
}
