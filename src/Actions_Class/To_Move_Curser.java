package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class To_Move_Curser
{
public static void main(String[] args) throws InterruptedException 
{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hitesh Mane\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	// To identify webelement and store it into an object
		WebElement obj=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		Thread.sleep(2000);
		
	// create an object of Actions class
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
	// to move curser
		act.moveToElement(obj).perform();
		Thread.sleep(2000);
		
	// to click on perticular option on webelement
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
	
	
}
}
