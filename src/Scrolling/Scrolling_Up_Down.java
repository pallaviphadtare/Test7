package Scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Up_Down 
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
	
	// scrolling down= 2nd par= +ve value---> after opening of webpage by default page will be at top so we can scroll down first
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
	
	// wait
		Thread.sleep(5000);
		
	// scrolling up=2nd par= -ve value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	
	
	
	
	
}
}
