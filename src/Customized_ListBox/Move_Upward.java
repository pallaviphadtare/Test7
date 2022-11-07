package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Upward
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	// to open an url
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	// to click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
	// to identify listbox anad store it into an object
		WebElement DOB=driver.findElement(By.name("birthday_day"));
		Thread.sleep(2000);
		
	// create an object of Actions class
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
	// call the method to click on listbox
		act.click(DOB).perform();		// 11
		Thread.sleep(2000);
		
	// to move upward
		act.sendKeys(Keys.ARROW_UP).perform();		// 10	
		act.sendKeys(Keys.ARROW_UP).perform();		// 9	
		act.sendKeys(Keys.ARROW_UP).perform();		// 8	
		Thread.sleep(2000);
		
//	 to move downward
//		act.sendKeys(Keys.ARROW_DOWN).perform();		// 9	
//		act.sendKeys(Keys.ARROW_DOWN).perform();		// 10	
//		Thread.sleep(2000);
//	
//	 to select perticular option
//		act.send
				
	
	
	
	
	
	
	
	
	
	
	
	
}
}
