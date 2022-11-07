package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_getTitle
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://web.whatsapp.com");
		Thread.sleep(2000);
		String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");	     
	Thread.sleep(2000);
   String Title1=driver.getTitle();	    
   System.out.println(Title1);     
   Thread.sleep(2000);
   
	
	
	
	
	}
}
