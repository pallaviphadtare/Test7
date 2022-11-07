package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement A=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	boolean Z=A.isDisplayed();
	System.out.println(Z);
	
	
	
	
	}	
	
	
}
