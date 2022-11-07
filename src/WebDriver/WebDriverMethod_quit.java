package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_quit
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		Driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		Driver.quit();
		
		
		
		
	}
}
