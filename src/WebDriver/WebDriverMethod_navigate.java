package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		
		Thread.sleep(2000);
		Driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		Driver.navigate().to("https://web.whatsapp.com");
		Thread.sleep(2000);
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();
		Thread.sleep(2000);
		Driver.navigate().refresh();
		
	}
	

}