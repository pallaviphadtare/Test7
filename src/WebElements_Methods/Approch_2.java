package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approch_2 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement UN=driver.findElement(By.xpath("//input[@autofocus='1']"));
	UN.sendKeys("abc");
	Thread.sleep(2000);
	UN.clear();
	Thread.sleep(2000);
	UN.sendKeys("Pallavi");
	
}
}
