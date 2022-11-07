package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooling_RightLeft_upto_Element
{
	public static void main(String[] args) throws InterruptedException
	{
		// open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Eclips jun\\Maven_Project\\Browser\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
		// open webpage
			driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
			driver.manage().window().maximize();
			
		// wait
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			
		// identify an element upto which have to scroll right
			WebElement ele=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[5]"));
			
		// scroll right upto specific element
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);
			
			
		// identify an element upto which have to scroll left
//			WebElement elem=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[2]"));
			
		// wait
			Thread.sleep(5000);
			
		// scroll left upto specific element
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();","(//div[@class='canvas-middle'])[2]");
			
	}
}
