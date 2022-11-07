package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	
	// to open an url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
	// to identify webelement n store it into an object
		WebElement s1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		
	// create an object of Actions class
		Actions act=new Actions(driver);
		Thread.sleep(2000);
	
	// to perform double click operation
		act.doubleClick(s1).perform();
	
	// to move selenium focus from main page to alert pop up
		Alert Al=driver.switchTo().alert();
		Thread.sleep(2000);
		
	// call the method to click on OK button
		Al.accept();
	
}
}
