package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooling_UpDown_upto_Element
{
	public static void main(String[] args) throws InterruptedException
	{
		// open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Eclips jun\\Maven_Project\\Browser\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
		// open webpage
			driver.get("http://demo.guru99.com/test/guru99home/");
			driver.manage().window().maximize();
			
		// wait
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			
		// identify an element upto which have to scroll down
			WebElement ele=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[11]"));
			
		// scroll down upto specific element
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);
			
			
		// identify an element upto which have to scroll up
			WebElement elem=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
			
		// wait
			Thread.sleep(5000);
			
		// scroll up upto specific element
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",elem);
			
	}
}