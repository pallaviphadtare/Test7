package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
	
	
	
	
	
	
	
	
	
	
}
}
